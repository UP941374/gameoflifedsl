/**
 * generated by Xtext 2.28.0
 */
package goldsl.tasksDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goldsl.tasksDSL.Cell#getNCells <em>NCells</em>}</li>
 *   <li>{@link goldsl.tasksDSL.Cell#getFillCells <em>Fill Cells</em>}</li>
 * </ul>
 *
 * @see goldsl.tasksDSL.TasksDSLPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject
{
  /**
   * Returns the value of the '<em><b>NCells</b></em>' containment reference list.
   * The list contents are of type {@link goldsl.tasksDSL.NormalCell}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>NCells</em>' containment reference list.
   * @see goldsl.tasksDSL.TasksDSLPackage#getCell_NCells()
   * @model containment="true"
   * @generated
   */
  EList<NormalCell> getNCells();

  /**
   * Returns the value of the '<em><b>Fill Cells</b></em>' containment reference list.
   * The list contents are of type {@link goldsl.tasksDSL.FillCell}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fill Cells</em>' containment reference list.
   * @see goldsl.tasksDSL.TasksDSLPackage#getCell_FillCells()
   * @model containment="true"
   * @generated
   */
  EList<FillCell> getFillCells();

} // Cell
