/**
 */
package net.sf.orcc.cal.cal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ast Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.sf.orcc.cal.cal.AstPort#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link net.sf.orcc.cal.cal.AstPort#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.orcc.cal.cal.AstPort#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see net.sf.orcc.cal.cal.CalPackage#getAstPort()
 * @model
 * @generated
 */
public interface AstPort extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.orcc.cal.cal.AstAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see net.sf.orcc.cal.cal.CalPackage#getAstPort_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<AstAnnotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(AstType)
   * @see net.sf.orcc.cal.cal.CalPackage#getAstPort_Type()
   * @model containment="true"
   * @generated
   */
  AstType getType();

  /**
   * Sets the value of the '{@link net.sf.orcc.cal.cal.AstPort#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AstType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.sf.orcc.cal.cal.CalPackage#getAstPort_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.orcc.cal.cal.AstPort#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // AstPort
