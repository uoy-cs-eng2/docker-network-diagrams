/**
 */
package dockerNetwork.impl;

import dockerNetwork.DockerNetworkPackage;
import dockerNetwork.Machine;
import dockerNetwork.Network;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockerNetwork.impl.NetworkImpl#getIpRange <em>Ip Range</em>}</li>
 *   <li>{@link dockerNetwork.impl.NetworkImpl#getMachine <em>Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends NamedImpl implements Network {
	/**
	 * The default value of the '{@link #getIpRange() <em>Ip Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpRange()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpRange() <em>Ip Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpRange()
	 * @generated
	 * @ordered
	 */
	protected String ipRange = IP_RANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMachine() <em>Machine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachine()
	 * @generated
	 * @ordered
	 */
	protected EList<Machine> machine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerNetworkPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpRange() {
		return ipRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpRange(String newIpRange) {
		String oldIpRange = ipRange;
		ipRange = newIpRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerNetworkPackage.NETWORK__IP_RANGE, oldIpRange, ipRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Machine> getMachine() {
		if (machine == null) {
			machine = new EObjectContainmentEList<Machine>(Machine.class, this, DockerNetworkPackage.NETWORK__MACHINE);
		}
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockerNetworkPackage.NETWORK__MACHINE:
				return ((InternalEList<?>)getMachine()).basicRemove(otherEnd, msgs);
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
			case DockerNetworkPackage.NETWORK__IP_RANGE:
				return getIpRange();
			case DockerNetworkPackage.NETWORK__MACHINE:
				return getMachine();
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
			case DockerNetworkPackage.NETWORK__IP_RANGE:
				setIpRange((String)newValue);
				return;
			case DockerNetworkPackage.NETWORK__MACHINE:
				getMachine().clear();
				getMachine().addAll((Collection<? extends Machine>)newValue);
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
			case DockerNetworkPackage.NETWORK__IP_RANGE:
				setIpRange(IP_RANGE_EDEFAULT);
				return;
			case DockerNetworkPackage.NETWORK__MACHINE:
				getMachine().clear();
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
			case DockerNetworkPackage.NETWORK__IP_RANGE:
				return IP_RANGE_EDEFAULT == null ? ipRange != null : !IP_RANGE_EDEFAULT.equals(ipRange);
			case DockerNetworkPackage.NETWORK__MACHINE:
				return machine != null && !machine.isEmpty();
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
		result.append(" (ipRange: ");
		result.append(ipRange);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
