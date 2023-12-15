/**
 */
package dockerNetwork;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockerNetwork.Process#getConnectsTo <em>Connects To</em>}</li>
 *   <li>{@link dockerNetwork.Process#getListensOn <em>Listens On</em>}</li>
 * </ul>
 *
 * @see dockerNetwork.DockerNetworkPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends Named {
	/**
	 * Returns the value of the '<em><b>Connects To</b></em>' reference list.
	 * The list contents are of type {@link dockerNetwork.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects To</em>' reference list.
	 * @see dockerNetwork.DockerNetworkPackage#getProcess_ConnectsTo()
	 * @model
	 * @generated
	 */
	EList<Port> getConnectsTo();

	/**
	 * Returns the value of the '<em><b>Listens On</b></em>' reference list.
	 * The list contents are of type {@link dockerNetwork.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listens On</em>' reference list.
	 * @see dockerNetwork.DockerNetworkPackage#getProcess_ListensOn()
	 * @model
	 * @generated
	 */
	EList<Port> getListensOn();

} // Process
