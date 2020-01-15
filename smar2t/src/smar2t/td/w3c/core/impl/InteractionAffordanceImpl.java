/**
 */
package smar2t.td.w3c.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import smar2t.td.w3c.core.CorePackage;
import smar2t.td.w3c.core.InteractionAffordance;
import smar2t.td.w3c.core.MultiLanguage;

import smar2t.td.w3c.hypermediacontrols.Form;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Affordance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.w3c.core.impl.InteractionAffordanceImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.impl.InteractionAffordanceImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.impl.InteractionAffordanceImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.impl.InteractionAffordanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.impl.InteractionAffordanceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.impl.InteractionAffordanceImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InteractionAffordanceImpl extends MinimalEObjectImpl.Container implements InteractionAffordance {
	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> forms;

	/**
	 * The cached value of the '{@link #getTitles() <em>Titles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitles()
	 * @generated
	 * @ordered
	 */
	protected MultiLanguage titles;

	/**
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected MultiLanguage descriptions;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> type;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionAffordanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.INTERACTION_AFFORDANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Form> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<Form>(Form.class, this, CorePackage.INTERACTION_AFFORDANCE__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLanguage getTitles() {
		if (titles != null && titles.eIsProxy()) {
			InternalEObject oldTitles = (InternalEObject)titles;
			titles = (MultiLanguage)eResolveProxy(oldTitles);
			if (titles != oldTitles) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.INTERACTION_AFFORDANCE__TITLES, oldTitles, titles));
			}
		}
		return titles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLanguage basicGetTitles() {
		return titles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitles(MultiLanguage newTitles) {
		MultiLanguage oldTitles = titles;
		titles = newTitles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_AFFORDANCE__TITLES, oldTitles, titles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLanguage getDescriptions() {
		if (descriptions != null && descriptions.eIsProxy()) {
			InternalEObject oldDescriptions = (InternalEObject)descriptions;
			descriptions = (MultiLanguage)eResolveProxy(oldDescriptions);
			if (descriptions != oldDescriptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.INTERACTION_AFFORDANCE__DESCRIPTIONS, oldDescriptions, descriptions));
			}
		}
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLanguage basicGetDescriptions() {
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptions(MultiLanguage newDescriptions) {
		MultiLanguage oldDescriptions = descriptions;
		descriptions = newDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_AFFORDANCE__DESCRIPTIONS, oldDescriptions, descriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getType() {
		if (type == null) {
			type = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.INTERACTION_AFFORDANCE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_AFFORDANCE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_AFFORDANCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INTERACTION_AFFORDANCE__FORMS:
				return ((InternalEList<?>)getForms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.INTERACTION_AFFORDANCE__FORMS:
				return getForms();
			case CorePackage.INTERACTION_AFFORDANCE__TITLES:
				if (resolve) return getTitles();
				return basicGetTitles();
			case CorePackage.INTERACTION_AFFORDANCE__DESCRIPTIONS:
				if (resolve) return getDescriptions();
				return basicGetDescriptions();
			case CorePackage.INTERACTION_AFFORDANCE__TYPE:
				return getType();
			case CorePackage.INTERACTION_AFFORDANCE__TITLE:
				return getTitle();
			case CorePackage.INTERACTION_AFFORDANCE__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.INTERACTION_AFFORDANCE__FORMS:
				getForms().clear();
				getForms().addAll((Collection<? extends Form>)newValue);
				return;
			case CorePackage.INTERACTION_AFFORDANCE__TITLES:
				setTitles((MultiLanguage)newValue);
				return;
			case CorePackage.INTERACTION_AFFORDANCE__DESCRIPTIONS:
				setDescriptions((MultiLanguage)newValue);
				return;
			case CorePackage.INTERACTION_AFFORDANCE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.INTERACTION_AFFORDANCE__TITLE:
				setTitle((String)newValue);
				return;
			case CorePackage.INTERACTION_AFFORDANCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.INTERACTION_AFFORDANCE__FORMS:
				getForms().clear();
				return;
			case CorePackage.INTERACTION_AFFORDANCE__TITLES:
				setTitles((MultiLanguage)null);
				return;
			case CorePackage.INTERACTION_AFFORDANCE__DESCRIPTIONS:
				setDescriptions((MultiLanguage)null);
				return;
			case CorePackage.INTERACTION_AFFORDANCE__TYPE:
				getType().clear();
				return;
			case CorePackage.INTERACTION_AFFORDANCE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CorePackage.INTERACTION_AFFORDANCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.INTERACTION_AFFORDANCE__FORMS:
				return forms != null && !forms.isEmpty();
			case CorePackage.INTERACTION_AFFORDANCE__TITLES:
				return titles != null;
			case CorePackage.INTERACTION_AFFORDANCE__DESCRIPTIONS:
				return descriptions != null;
			case CorePackage.INTERACTION_AFFORDANCE__TYPE:
				return type != null && !type.isEmpty();
			case CorePackage.INTERACTION_AFFORDANCE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CorePackage.INTERACTION_AFFORDANCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //InteractionAffordanceImpl