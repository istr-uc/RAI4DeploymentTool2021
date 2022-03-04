/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.PersistenceServer#getLogging <em>Logging</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.PersistenceServer#getPasswd <em>Passwd</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.PersistenceServer#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getPersistenceServer()
 * @model abstract="true"
 * @generated
 */
public interface PersistenceServer extends PlatformServer {
	/**
	 * Returns the value of the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logging</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logging</em>' attribute.
	 * @see #setLogging(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPersistenceServer_Logging()
	 * @model required="true"
	 * @generated
	 */
	String getLogging();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.PersistenceServer#getLogging <em>Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logging</em>' attribute.
	 * @see #getLogging()
	 * @generated
	 */
	void setLogging(String value);

	/**
	 * Returns the value of the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passwd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passwd</em>' attribute.
	 * @see #setPasswd(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPersistenceServer_Passwd()
	 * @model required="true"
	 * @generated
	 */
	String getPasswd();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.PersistenceServer#getPasswd <em>Passwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passwd</em>' attribute.
	 * @see #getPasswd()
	 * @generated
	 */
	void setPasswd(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"9098"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPersistenceServer_Port()
	 * @model default="9098"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.PersistenceServer#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

} // PersistenceServer
