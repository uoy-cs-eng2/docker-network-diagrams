/**
 */
package dockerNetwork;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockerNetwork.Machine#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link dockerNetwork.Machine#getExposedPorts <em>Exposed Ports</em>}</li>
 * </ul>
 *
 * @see dockerNetwork.DockerNetworkPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends Named {
	/**
	 * Returns the value of the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Address</em>' attribute.
	 * @see #setIpAddress(String)
	 * @see dockerNetwork.DockerNetworkPackage#getMachine_IpAddress()
	 * @model
	 * @generated
	 */
	String getIpAddress();

	/**
	 * Sets the value of the '{@link dockerNetwork.Machine#getIpAddress <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Address</em>' attribute.
	 * @see #getIpAddress()
	 * @generated
	 */
	void setIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Exposed Ports</b></em>' containment reference list.
	 * The list contents are of type {@link dockerNetwork.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed Ports</em>' containment reference list.
	 * @see dockerNetwork.DockerNetworkPackage#getMachine_ExposedPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getExposedPorts();

} // Machine
