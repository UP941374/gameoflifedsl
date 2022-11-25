/**
 * generated by Xtext 2.28.0
 */
package goldsl.tasksDSL.util;

import goldsl.tasksDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see goldsl.tasksDSL.TasksDSLPackage
 * @generated
 */
public class TasksDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TasksDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TasksDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TasksDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TasksDSLSwitch<Adapter> modelSwitch =
    new TasksDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseGameOfLife(GameOfLife object)
      {
        return createGameOfLifeAdapter();
      }
      @Override
      public Adapter caseGrid(Grid object)
      {
        return createGridAdapter();
      }
      @Override
      public Adapter caseCell(Cell object)
      {
        return createCellAdapter();
      }
      @Override
      public Adapter caseNormalCell(NormalCell object)
      {
        return createNormalCellAdapter();
      }
      @Override
      public Adapter caseFillCell(FillCell object)
      {
        return createFillCellAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link goldsl.tasksDSL.GameOfLife <em>Game Of Life</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see goldsl.tasksDSL.GameOfLife
   * @generated
   */
  public Adapter createGameOfLifeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link goldsl.tasksDSL.Grid <em>Grid</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see goldsl.tasksDSL.Grid
   * @generated
   */
  public Adapter createGridAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link goldsl.tasksDSL.Cell <em>Cell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see goldsl.tasksDSL.Cell
   * @generated
   */
  public Adapter createCellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link goldsl.tasksDSL.NormalCell <em>Normal Cell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see goldsl.tasksDSL.NormalCell
   * @generated
   */
  public Adapter createNormalCellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link goldsl.tasksDSL.FillCell <em>Fill Cell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see goldsl.tasksDSL.FillCell
   * @generated
   */
  public Adapter createFillCellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link goldsl.tasksDSL.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see goldsl.tasksDSL.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TasksDSLAdapterFactory
