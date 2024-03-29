/**
 */
package thing_ui.interaction;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.interaction.ObjectInput#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @see thing_ui.interaction.InteractionPackage#getObjectInput()
 * @model
 * @generated
 */
public interface ObjectInput extends Input {
	/**
	 * Returns the value of the '<em><b>Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' reference.
	 * @see #setForm(Form)
	 * @see thing_ui.interaction.InteractionPackage#getObjectInput_Form()
	 * @model required="true"
	 * @generated
	 */
	Form getForm();

	/**
	 * Sets the value of the '{@link thing_ui.interaction.ObjectInput#getForm <em>Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Form value);

} // ObjectInput
