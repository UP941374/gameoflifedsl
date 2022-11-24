/**
 * generated by Xtext 2.28.0
 */
package goldsl.tasksDSL.impl;

import goldsl.tasksDSL.Cell;
import goldsl.tasksDSL.CompareSign;
import goldsl.tasksDSL.Direction;
import goldsl.tasksDSL.FillCell;
import goldsl.tasksDSL.GameOfLife;
import goldsl.tasksDSL.NormalCell;
import goldsl.tasksDSL.Rule;
import goldsl.tasksDSL.RuleType;
import goldsl.tasksDSL.TasksDSLFactory;
import goldsl.tasksDSL.TasksDSLPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TasksDSLPackageImpl extends EPackageImpl implements TasksDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gameOfLifeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normalCellEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fillCellEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum directionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ruleTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum compareSignEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see goldsl.tasksDSL.TasksDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TasksDSLPackageImpl()
  {
    super(eNS_URI, TasksDSLFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link TasksDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TasksDSLPackage init()
  {
    if (isInited) return (TasksDSLPackage)EPackage.Registry.INSTANCE.getEPackage(TasksDSLPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredTasksDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    TasksDSLPackageImpl theTasksDSLPackage = registeredTasksDSLPackage instanceof TasksDSLPackageImpl ? (TasksDSLPackageImpl)registeredTasksDSLPackage : new TasksDSLPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theTasksDSLPackage.createPackageContents();

    // Initialize created meta-data
    theTasksDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTasksDSLPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TasksDSLPackage.eNS_URI, theTasksDSLPackage);
    return theTasksDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGameOfLife()
  {
    return gameOfLifeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGameOfLife_Cells()
  {
    return (EReference)gameOfLifeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGameOfLife_Rules()
  {
    return (EReference)gameOfLifeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCell()
  {
    return cellEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCell_NCells()
  {
    return (EReference)cellEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCell_FillCells()
  {
    return (EReference)cellEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNormalCell()
  {
    return normalCellEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNormalCell_X()
  {
    return (EAttribute)normalCellEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNormalCell_Y()
  {
    return (EAttribute)normalCellEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFillCell()
  {
    return fillCellEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFillCell_X()
  {
    return (EAttribute)fillCellEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFillCell_Y()
  {
    return (EAttribute)fillCellEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFillCell_RepAmount()
  {
    return (EAttribute)fillCellEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFillCell_Dir()
  {
    return (EAttribute)fillCellEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRule_Type()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRule_Sign()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRule_N()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getDirection()
  {
    return directionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getRuleType()
  {
    return ruleTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getCompareSign()
  {
    return compareSignEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TasksDSLFactory getTasksDSLFactory()
  {
    return (TasksDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    gameOfLifeEClass = createEClass(GAME_OF_LIFE);
    createEReference(gameOfLifeEClass, GAME_OF_LIFE__CELLS);
    createEReference(gameOfLifeEClass, GAME_OF_LIFE__RULES);

    cellEClass = createEClass(CELL);
    createEReference(cellEClass, CELL__NCELLS);
    createEReference(cellEClass, CELL__FILL_CELLS);

    normalCellEClass = createEClass(NORMAL_CELL);
    createEAttribute(normalCellEClass, NORMAL_CELL__X);
    createEAttribute(normalCellEClass, NORMAL_CELL__Y);

    fillCellEClass = createEClass(FILL_CELL);
    createEAttribute(fillCellEClass, FILL_CELL__X);
    createEAttribute(fillCellEClass, FILL_CELL__Y);
    createEAttribute(fillCellEClass, FILL_CELL__REP_AMOUNT);
    createEAttribute(fillCellEClass, FILL_CELL__DIR);

    ruleEClass = createEClass(RULE);
    createEAttribute(ruleEClass, RULE__TYPE);
    createEAttribute(ruleEClass, RULE__SIGN);
    createEAttribute(ruleEClass, RULE__N);

    // Create enums
    directionEEnum = createEEnum(DIRECTION);
    ruleTypeEEnum = createEEnum(RULE_TYPE);
    compareSignEEnum = createEEnum(COMPARE_SIGN);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(gameOfLifeEClass, GameOfLife.class, "GameOfLife", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGameOfLife_Cells(), this.getCell(), null, "cells", null, 0, -1, GameOfLife.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGameOfLife_Rules(), this.getRule(), null, "rules", null, 0, -1, GameOfLife.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cellEClass, Cell.class, "Cell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCell_NCells(), this.getNormalCell(), null, "nCells", null, 0, -1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCell_FillCells(), this.getFillCell(), null, "fillCells", null, 0, -1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(normalCellEClass, NormalCell.class, "NormalCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNormalCell_X(), ecorePackage.getEInt(), "x", null, 0, 1, NormalCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNormalCell_Y(), ecorePackage.getEInt(), "y", null, 0, 1, NormalCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fillCellEClass, FillCell.class, "FillCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFillCell_X(), ecorePackage.getEInt(), "x", null, 0, 1, FillCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFillCell_Y(), ecorePackage.getEInt(), "y", null, 0, 1, FillCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFillCell_RepAmount(), ecorePackage.getEInt(), "repAmount", null, 0, 1, FillCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFillCell_Dir(), this.getDirection(), "dir", null, 0, 1, FillCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRule_Type(), this.getRuleType(), "type", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRule_Sign(), this.getCompareSign(), "sign", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRule_N(), ecorePackage.getEInt(), "n", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(directionEEnum, Direction.class, "Direction");
    addEEnumLiteral(directionEEnum, Direction.NORTH);
    addEEnumLiteral(directionEEnum, Direction.EAST);
    addEEnumLiteral(directionEEnum, Direction.SOUTH);
    addEEnumLiteral(directionEEnum, Direction.WEST);

    initEEnum(ruleTypeEEnum, RuleType.class, "RuleType");
    addEEnumLiteral(ruleTypeEEnum, RuleType.COME_ALIVE);
    addEEnumLiteral(ruleTypeEEnum, RuleType.STAY);
    addEEnumLiteral(ruleTypeEEnum, RuleType.DIE);

    initEEnum(compareSignEEnum, CompareSign.class, "CompareSign");
    addEEnumLiteral(compareSignEEnum, CompareSign.BIGGER_THAN);
    addEEnumLiteral(compareSignEEnum, CompareSign.EQUAL);
    addEEnumLiteral(compareSignEEnum, CompareSign.SMALLER_THAN);

    // Create resource
    createResource(eNS_URI);
  }

} //TasksDSLPackageImpl
