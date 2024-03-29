/**
 */
package w3c_td.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Affordance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.core.ActionAffordance#isSafe <em>Safe</em>}</li>
 *   <li>{@link w3c_td.core.ActionAffordance#isIdempotent <em>Idempotent</em>}</li>
 * </ul>
 *
 * @see w3c_td.core.CorePackage#getActionAffordance()
 * @model
 * @generated
 */
public interface ActionAffordance extends InteractionAffordance {
	/**
	 * Returns the value of the '<em><b>Safe</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe</em>' attribute.
	 * @see #setSafe(boolean)
	 * @see w3c_td.core.CorePackage#getActionAffordance_Safe()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSafe();

	/**
	 * Sets the value of the '{@link w3c_td.core.ActionAffordance#isSafe <em>Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safe</em>' attribute.
	 * @see #isSafe()
	 * @generated
	 */
	void setSafe(boolean value);

	/**
	 * Returns the value of the '<em><b>Idempotent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idempotent</em>' attribute.
	 * @see #setIdempotent(boolean)
	 * @see w3c_td.core.CorePackage#getActionAffordance_Idempotent()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIdempotent();

	/**
	 * Sets the value of the '{@link w3c_td.core.ActionAffordance#isIdempotent <em>Idempotent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idempotent</em>' attribute.
	 * @see #isIdempotent()
	 * @generated
	 */
	void setIdempotent(boolean value);

} // ActionAffordance
