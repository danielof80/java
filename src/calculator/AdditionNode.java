/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author usuario
 */
public class AdditionNode extends OperatorNode {
    public double evaluate() {
    return left.evaluate() + right.evaluate();
    }
}
