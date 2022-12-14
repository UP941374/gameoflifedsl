/**
 * generated by Xtext 2.28.0
 */
package goldsl.tasksDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see goldsl.tasksDSL.TasksDSLPackage
 * @generated
 */
public interface TasksDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TasksDSLFactory eINSTANCE = goldsl.tasksDSL.impl.TasksDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Game Of Life</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Game Of Life</em>'.
   * @generated
   */
  GameOfLife createGameOfLife();

  /**
   * Returns a new object of class '<em>Grid</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grid</em>'.
   * @generated
   */
  Grid createGrid();

  /**
   * Returns a new object of class '<em>Cell</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell</em>'.
   * @generated
   */
  Cell createCell();

  /**
   * Returns a new object of class '<em>Normal Cell</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Normal Cell</em>'.
   * @generated
   */
  NormalCell createNormalCell();

  /**
   * Returns a new object of class '<em>Fill Cell</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fill Cell</em>'.
   * @generated
   */
  FillCell createFillCell();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TasksDSLPackage getTasksDSLPackage();

} //TasksDSLFactory
