
package main;

import java.util.ArrayList;

class Term {
    double coef;  // معامل 
    int exp;   // أس 

    public Term(double coef, int exp) {
        this.coef = coef;
        this.exp = exp;
    }
}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

class Node {
    Term term;
    Node next;

    public Node(Term term) {
        this.term = term;
        this.next = null;
    }
}
//++++++++++++++++++++++++++++++++++++++++++++++++

public class Poly {
    Node head;

    public Poly() {
        head = null;
    }

public void addTerm(double coef, int exp) {
        Term newTerm = new Term(coef, exp);
        Node newNode = new Node(newTerm);

        if (head == null) {
            head = newNode;
            return;
        }

        if (exp > head.term.exp) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null && temp.term.exp >= exp) {
            if (temp.term.exp == exp) {
                temp.term.coef += coef;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
        newNode.next = temp;
        if (prev != null) {
            prev.next = newNode;
        }
    }
   
public Poly add(Poly p) {
    Poly result = new Poly();

    Node text1 = this.head;
    Node text2 = p.head;

    while (text1 != null && text2 != null) {
        if (text1.term.exp == text2.term.exp) {
            double sum = text1.term.coef + text2.term.coef;
            if (sum != 0) 
            result.addTerm(sum, text1.term.exp);
            text1 = text1.next;
            text2 = text2.next;
        } 
        else if (text1.term.exp > text2.term.exp) {
            result.addTerm(text1.term.coef, text1.term.exp);
            text1 = text1.next;
        }
        else {
            result.addTerm(text2.term.coef, text2.term.exp);
            text2 = text2.next;
        }
    }

    while (text1 != null) {
        result.addTerm(text1.term.coef, text1.term.exp);
        text1 = text1.next;
    }

    while (text2 != null) {
        result.addTerm(text2.term.coef, text2.term.exp);
        text2 = text2.next;
    }

    return result;
}
 
public Poly sub(Poly p) {
    Poly result = new Poly();
    Node text1 = this.head;
    Node text2 = p.head;

    while (text1 != null && text2 != null) {
        if (text1.term.exp == text2.term.exp) {
            double sub = text1.term.coef - text2.term.coef;
            if (sub != 0)
            result.addTerm(sub, text1.term.exp);
            text1 = text1.next;
            text2 = text2.next;
        } 
        else if (text1.term.exp > text2.term.exp) {
            result.addTerm(text1.term.coef, text1.term.exp);
            text1 = text1.next;
        } 
        else {
            result.addTerm(-text2.term.coef, text2.term.exp);
            text2 = text2.next;
        }
    }
    while (text1 != null) {
        result.addTerm(text1.term.coef, text1.term.exp);
        text1 = text1.next;
    }
    while (text2 != null) {
        result.addTerm(-text2.term.coef, text2.term.exp);
        text2 = text2.next;
    }
    return result;
}

public Poly mul(Poly p) {
    Poly result = new Poly();
    
    for (Node text1 = this.head; text1 != null; text1 = text1.next) {
        for (Node text2 = p.head; text2 != null; text2 = text2.next) {
            double coefficient = text1.term.coef * text2.term.coef;
            int exponent = text1.term.exp + text2.term.exp;
            result.addTerm(coefficient, exponent);
        }
    }
    return result;
}

public double degree() {
    if (head == null) return -1; 

    return head.term.exp; 
}
///
public Poly div(Poly d) {
    if (d.head == null || d.degree() == -1) {
        
      throw new IllegalArgumentException("❌ Error Cannot divide by an empty polynomial");
    }
    if (this.head == null || this.degree() < d.degree()) {
      return new Poly();
    }
    Poly q = new Poly();    
    Poly r = new Poly();   

    Node temp = this.head;
    while (temp != null) {
        r.addTerm(temp.term.coef, temp.term.exp);
        temp = temp.next;
    }

    while (r.head != null && r.degree() >= d.degree()) {
        double coefficient = r.head.term.coef / d.head.term.coef;
        if (coefficient == 0) {
            break;
        }
        int exponent = r.head.term.exp - d.head.term.exp;

        Poly term = new Poly();
        term.addTerm(coefficient, exponent);

        q.addTerm(coefficient, exponent);

      Poly p = term.mul(d);

       r = r.sub(p);
    }

    return  q ;
}
///
public int evaluate(int x) {
    int result = 0;
    Node temp = head;
    while (temp != null) {
    result += temp.term.coef * (int)Math.pow(x, temp.term.exp);
        temp = temp.next;
    }
    return result;
}

public String Postfix() {
    if (head == null) return "0";

    Node temp = head;
    String result = "";

    boolean falg = true;

    while (temp != null) {
        double coef = temp.term.coef;
        int exp = temp.term.exp;

        double coefficient = Math.abs(coef);

        String term = "";
        if (exp == 0) {
            term = "" + coefficient;
        } else if (exp == 1) {
            term = coefficient + " x";
        } else {
            term = coefficient + " x " + exp + " ^";
        }

        if (falg) {
            result += term;
            falg = false;
        } else {
            if (coef < 0) {
                result += " " + term + " -";
            } else {
                result += " " + term + " +";
            }
        }

        temp = temp.next;
    }

    return result;
}

public String Prefix() {
    if (head == null) return "0";

    Node temp = head;
    String result = "";

    while (temp != null) {
        double c = temp.term.coef;
        int e = temp.term.exp;
        String term = "";

        if (e == 0) {
            term = "" + Math.abs(c);
        } else if (e == 1) {
            term = "* " + Math.abs(c) + " x";
        } else {
            term = "* " + Math.abs(c) + " ^ x " + e;
        }

        if (result.isEmpty()) {
            result = term;
        } else {
            if (c < 0) {
                result = "- " + result + " " + term;
            } else {
                result = "+ " + result + " " + term;
            }
        }

        temp = temp.next;
    }

    return result;
}

public String infix() {
    if (head == null){
        return "0";}
    
    Node temp = head;
    String result = "";

    while (temp != null) {
        double c = temp.term.coef;
        int e = temp.term.exp;

        if (c > 0 && temp != head) {
            result += " + ";
        } else if (c < 0) {
            result += " - ";
        }

        double coefficient = Math.abs(c);

        if (coefficient != 1 || e == 0) {
            result += coefficient;
        }
        if (e > 0) {
            result += "X";
            if (e > 1) {
                result += "^" + e;
            }
        }
        temp = temp.next;
    }
    return result;
}

public static Poly parse(String p) {
    Poly result = new Poly();
    p = p.replaceAll("\\s+", ""); 

    int i = 0;
    int length = p.length();

    while (i < length) {
        int flag = 1;
        if (p.charAt(i) == '+') {
            i++;
        } else if (p.charAt(i) == '-') {
            flag = -1;
            i++;
        }

        StringBuilder coef = new StringBuilder();
        while (i < length && Character.isDigit(p.charAt(i))) {
            coef.append(p.charAt(i));
            i++;
        }

        int coefficient = coef.length() > 0 ? Integer.parseInt(coef.toString()) : 1;
        coefficient *= flag;

        int exponent = 0;
        if (i < length && (p.charAt(i) == 'X' || p.charAt(i) == 'x')) {
            i++; 
            exponent = 1;
            if (i < length && p.charAt(i) == '^') {
                i++; 
                StringBuilder e = new StringBuilder();
                while (i < length && Character.isDigit(p.charAt(i))) {
                    e.append(p.charAt(i));
                    i++;
                }
                exponent = Integer.parseInt(e.toString());
            }
        }

        result.addTerm(coefficient, exponent);
    }

    return result;
}

public  String roots(Poly p) {
    double a = 0, b = 0, c = 0;
    Node temp = p.head;

    while (temp != null) {
        int exp = temp.term.exp;   
        double coef = temp.term.coef; 

        if (exp == 2) 
            a =  coef;      
        else if (exp == 1) 
            b = coef;  
        else if 
                (exp == 0) c = coef;  

        temp = temp.next;
    }

    if (a == 0.0) {
        return "This is not a quadratic equation.";
    }
    double d = b * b - 4 * a * c;
    if (d < 0) {
        return "No real roots.";
    }
    double x1 = (-b + Math.sqrt(d)) / (2 * a);
    double x2 = (-b - Math.sqrt(d)) / (2 * a);

    double root1 = Math.round(x1 * 100.0) / 100.0;
   double root2 = Math.round(x2 * 100.0) / 100.0;

    if (d == 0.0) {
        return "One root: " + root1;
    } else {
        return "Two roots: " + root1 + " and " + root2;
    }


}



}
