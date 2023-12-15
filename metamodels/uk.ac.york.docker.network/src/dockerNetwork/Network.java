/**
 */
package dockerNetwork;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockerNetwork.Network#getIpRange <em>Ip Range</em>}</li>
 *   <li>{@link dockerNetwork.Network#getMachine <em>Machine</em>}</li>
 * </ul>
 *
 * @see dockerNetwork.DockerNetworkPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends Named {
	/**
	 * Returns the value of the '<em><b>Ip Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Range</em>' attribute.
	 * @see #setIpRange(String)
	 * @see dockerNetwork.DockerNetworkPackage#getNetwork_IpRange()
	 * @model
	 * @generated
	 */
	String getIpRange();

	/**
	 * Sets the value of the '{@link dockerNetwork.Network#getIpRange <em>Ip Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Range</em>' attribute.
	 * @see #getIpRange()
	 * @generated
	 */
	void setIpRange(String value);

	/**
	 * Returns the value of the '<em><b>Machine</b></em>' containment reference list.
	 * The list contents are of type {@link dockerNetwork.Machine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' containment reference list.
	 * @see dockerNetwork.DockerNetworkPackage#getNetwork_Machine()
	 * @model containment="true"
	 * @generated
	 */
	EList<Machine> getMachine();

} // Network
