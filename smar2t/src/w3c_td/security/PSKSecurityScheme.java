/**
 */
package w3c_td.security;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSK Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.security.PSKSecurityScheme#getIdentity <em>Identity</em>}</li>
 * </ul>
 *
 * @see w3c_td.security.SecurityPackage#getPSKSecurityScheme()
 * @model
 * @generated
 */
public interface PSKSecurityScheme extends SecurityScheme {
	/**
	 * Returns the value of the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' attribute.
	 * @see #setIdentity(String)
	 * @see w3c_td.security.SecurityPackage#getPSKSecurityScheme_Identity()
	 * @model
	 * @generated
	 */
	String getIdentity();

	/**
	 * Sets the value of the '{@link w3c_td.security.PSKSecurityScheme#getIdentity <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' attribute.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(String value);

} // PSKSecurityScheme
