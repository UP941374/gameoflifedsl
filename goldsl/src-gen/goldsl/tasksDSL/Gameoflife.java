/**
 * generated by Xtext 2.28.0
 */
package goldsl.tasksDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gameoflife</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goldsl.tasksDSL.Gameoflife#getCells <em>Cells</em>}</li>
 *   <li>{@link goldsl.tasksDSL.Gameoflife#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see goldsl.tasksDSL.TasksDSLPackage#getGameoflife()
 * @model
 * @generated
 */
public interface Gameoflife extends EObject
{
  /**
   * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
   * The list contents are of type {@link goldsl.tasksDSL.Cell}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cells</em>' containment reference list.
   * @see goldsl.tasksDSL.TasksDSLPackage#getGameoflife_Cells()
   * @model containment="true"
   * @generated
   */
  EList<Cell> getCells();

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link goldsl.tasksDSL.Rule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see goldsl.tasksDSL.TasksDSLPackage#getGameoflife_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRules();

} // Gameoflife