/**
 */
package dockerNetwork;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockerNetwork.Port#getNumber <em>Number</em>}</li>
 *   <li>{@link dockerNetwork.Port#getMappedTo <em>Mapped To</em>}</li>
 *   <li>{@link dockerNetwork.Port#getMappedFrom <em>Mapped From</em>}</li>
 * </ul>
 *
 * @see dockerNetwork.DockerNetworkPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(Integer)
	 * @see dockerNetwork.DockerNetworkPackage#getPort_Number()
	 * @model
	 * @generated
	 */
	Integer getNumber();

	/**
	 * Sets the value of the '{@link dockerNetwork.Port#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Mapped To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dockerNetwork.Port#getMappedFrom <em>Mapped From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped To</em>' reference.
	 * @see #setMappedTo(Port)
	 * @see dockerNetwork.DockerNetworkPackage#getPort_MappedTo()
	 * @see dockerNetwork.Port#getMappedFrom
	 * @model opposite="mappedFrom"
	 * @generated
	 */
	Port getMappedTo();

	/**
	 * Sets the value of the '{@link dockerNetwork.Port#getMappedTo <em>Mapped To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped To</em>' reference.
	 * @see #getMappedTo()
	 * @generated
	 */
	void setMappedTo(Port value);

	/**
	 * Returns the value of the '<em><b>Mapped From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dockerNetwork.Port#getMappedTo <em>Mapped To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped From</em>' reference.
	 * @see #setMappedFrom(Port)
	 * @see dockerNetwork.DockerNetworkPackage#getPort_MappedFrom()
	 * @see dockerNetwork.Port#getMappedTo
	 * @model opposite="mappedTo"
	 * @generated
	 */
	Port getMappedFrom();

	/**
	 * Sets the value of the '{@link dockerNetwork.Port#getMappedFrom <em>Mapped From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped From</em>' reference.
	 * @see #getMappedFrom()
	 * @generated
	 */
	void setMappedFrom(Port value);

} // Port
