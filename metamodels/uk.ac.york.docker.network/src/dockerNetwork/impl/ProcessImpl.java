/**
 */
package dockerNetwork.impl;

import dockerNetwork.DockerNetworkPackage;
import dockerNetwork.Port;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockerNetwork.impl.ProcessImpl#getConnectsTo <em>Connects To</em>}</li>
 *   <li>{@link dockerNetwork.impl.ProcessImpl#getListensOn <em>Listens On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends NamedImpl implements dockerNetwork.Process {
	/**
	 * The cached value of the '{@link #getConnectsTo() <em>Connects To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> connectsTo;

	/**
	 * The cached value of the '{@link #getListensOn() <em>Listens On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListensOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> listensOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerNetworkPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getConnectsTo() {
		if (connectsTo == null) {
			connectsTo = new EObjectResolvingEList<Port>(Port.class, this, DockerNetworkPackage.PROCESS__CONNECTS_TO);
		}
		return connectsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getListensOn() {
		if (listensOn == null) {
			listensOn = new EObjectResolvingEList<Port>(Port.class, this, DockerNetworkPackage.PROCESS__LISTENS_ON);
		}
		return listensOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerNetworkPackage.PROCESS__CONNECTS_TO:
				return getConnectsTo();
			case DockerNetworkPackage.PROCESS__LISTENS_ON:
				return getListensOn();
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
			case DockerNetworkPackage.PROCESS__CONNECTS_TO:
				getConnectsTo().clear();
				getConnectsTo().addAll((Collection<? extends Port>)newValue);
				return;
			case DockerNetworkPackage.PROCESS__LISTENS_ON:
				getListensOn().clear();
				getListensOn().addAll((Collection<? extends Port>)newValue);
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
			case DockerNetworkPackage.PROCESS__CONNECTS_TO:
				getConnectsTo().clear();
				return;
			case DockerNetworkPackage.PROCESS__LISTENS_ON:
				getListensOn().clear();
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
			case DockerNetworkPackage.PROCESS__CONNECTS_TO:
				return connectsTo != null && !connectsTo.isEmpty();
			case DockerNetworkPackage.PROCESS__LISTENS_ON:
				return listensOn != null && !listensOn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessImpl
