/**
 */
package dockerNetwork;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockerNetwork.Model#getNetwork <em>Network</em>}</li>
 *   <li>{@link dockerNetwork.Model#getProcesses <em>Processes</em>}</li>
 * </ul>
 *
 * @see dockerNetwork.DockerNetworkPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference list.
	 * The list contents are of type {@link dockerNetwork.Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference list.
	 * @see dockerNetwork.DockerNetworkPackage#getModel_Network()
	 * @model containment="true"
	 * @generated
	 */
	EList<Network> getNetwork();

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link dockerNetwork.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see dockerNetwork.DockerNetworkPackage#getModel_Processes()
	 * @model containment="true"
	 * @generated
	 */
	EList<dockerNetwork.Process> getProcesses();

} // Model
