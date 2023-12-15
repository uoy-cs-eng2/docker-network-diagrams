/**
 */
package dockerNetwork.impl;

import dockerNetwork.DockerNetworkPackage;
import dockerNetwork.Port;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockerNetwork.impl.PortImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link dockerNetwork.impl.PortImpl#getMappedTo <em>Mapped To</em>}</li>
 *   <li>{@link dockerNetwork.impl.PortImpl#getMappedFrom <em>Mapped From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends MinimalEObjectImpl.Container implements Port {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMappedTo() <em>Mapped To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedTo()
	 * @generated
	 * @ordered
	 */
	protected Port mappedTo;

	/**
	 * The cached value of the '{@link #getMappedFrom() <em>Mapped From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedFrom()
	 * @generated
	 * @ordered
	 */
	protected Port mappedFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerNetworkPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(Integer newNumber) {
		Integer oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerNetworkPackage.PORT__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getMappedTo() {
		if (mappedTo != null && mappedTo.eIsProxy()) {
			InternalEObject oldMappedTo = (InternalEObject)mappedTo;
			mappedTo = (Port)eResolveProxy(oldMappedTo);
			if (mappedTo != oldMappedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DockerNetworkPackage.PORT__MAPPED_TO, oldMappedTo, mappedTo));
			}
		}
		return mappedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetMappedTo() {
		return mappedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappedTo(Port newMappedTo, NotificationChain msgs) {
		Port oldMappedTo = mappedTo;
		mappedTo = newMappedTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockerNetworkPackage.PORT__MAPPED_TO, oldMappedTo, newMappedTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedTo(Port newMappedTo) {
		if (newMappedTo != mappedTo) {
			NotificationChain msgs = null;
			if (mappedTo != null)
				msgs = ((InternalEObject)mappedTo).eInverseRemove(this, DockerNetworkPackage.PORT__MAPPED_FROM, Port.class, msgs);
			if (newMappedTo != null)
				msgs = ((InternalEObject)newMappedTo).eInverseAdd(this, DockerNetworkPackage.PORT__MAPPED_FROM, Port.class, msgs);
			msgs = basicSetMappedTo(newMappedTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerNetworkPackage.PORT__MAPPED_TO, newMappedTo, newMappedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getMappedFrom() {
		if (mappedFrom != null && mappedFrom.eIsProxy()) {
			InternalEObject oldMappedFrom = (InternalEObject)mappedFrom;
			mappedFrom = (Port)eResolveProxy(oldMappedFrom);
			if (mappedFrom != oldMappedFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DockerNetworkPackage.PORT__MAPPED_FROM, oldMappedFrom, mappedFrom));
			}
		}
		return mappedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetMappedFrom() {
		return mappedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappedFrom(Port newMappedFrom, NotificationChain msgs) {
		Port oldMappedFrom = mappedFrom;
		mappedFrom = newMappedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockerNetworkPackage.PORT__MAPPED_FROM, oldMappedFrom, newMappedFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedFrom(Port newMappedFrom) {
		if (newMappedFrom != mappedFrom) {
			NotificationChain msgs = null;
			if (mappedFrom != null)
				msgs = ((InternalEObject)mappedFrom).eInverseRemove(this, DockerNetworkPackage.PORT__MAPPED_TO, Port.class, msgs);
			if (newMappedFrom != null)
				msgs = ((InternalEObject)newMappedFrom).eInverseAdd(this, DockerNetworkPackage.PORT__MAPPED_TO, Port.class, msgs);
			msgs = basicSetMappedFrom(newMappedFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerNetworkPackage.PORT__MAPPED_FROM, newMappedFrom, newMappedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockerNetworkPackage.PORT__MAPPED_TO:
				if (mappedTo != null)
					msgs = ((InternalEObject)mappedTo).eInverseRemove(this, DockerNetworkPackage.PORT__MAPPED_FROM, Port.class, msgs);
				return basicSetMappedTo((Port)otherEnd, msgs);
			case DockerNetworkPackage.PORT__MAPPED_FROM:
				if (mappedFrom != null)
					msgs = ((InternalEObject)mappedFrom).eInverseRemove(this, DockerNetworkPackage.PORT__MAPPED_TO, Port.class, msgs);
				return basicSetMappedFrom((Port)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockerNetworkPackage.PORT__MAPPED_TO:
				return basicSetMappedTo(null, msgs);
			case DockerNetworkPackage.PORT__MAPPED_FROM:
				return basicSetMappedFrom(null, msgs);
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
			case DockerNetworkPackage.PORT__NUMBER:
				return getNumber();
			case DockerNetworkPackage.PORT__MAPPED_TO:
				if (resolve) return getMappedTo();
				return basicGetMappedTo();
			case DockerNetworkPackage.PORT__MAPPED_FROM:
				if (resolve) return getMappedFrom();
				return basicGetMappedFrom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DockerNetworkPackage.PORT__NUMBER:
				setNumber((Integer)newValue);
				return;
			case DockerNetworkPackage.PORT__MAPPED_TO:
				setMappedTo((Port)newValue);
				return;
			case DockerNetworkPackage.PORT__MAPPED_FROM:
				setMappedFrom((Port)newValue);
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
			case DockerNetworkPackage.PORT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case DockerNetworkPackage.PORT__MAPPED_TO:
				setMappedTo((Port)null);
				return;
			case DockerNetworkPackage.PORT__MAPPED_FROM:
				setMappedFrom((Port)null);
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
			case DockerNetworkPackage.PORT__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case DockerNetworkPackage.PORT__MAPPED_TO:
				return mappedTo != null;
			case DockerNetworkPackage.PORT__MAPPED_FROM:
				return mappedFrom != null;
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
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //PortImpl
