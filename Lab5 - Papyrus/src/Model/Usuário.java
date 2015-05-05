/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuário</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Usuário#getNome <em>Nome</em>}</li>
 *   <li>{@link Model.Usuário#getCadastro <em>Cadastro</em>}</li>
 *   <li>{@link Model.Usuário#getInstituto <em>Instituto</em>}</li>
 *   <li>{@link Model.Usuário#getTipo <em>Tipo</em>}</li>
 *   <li>{@link Model.Usuário#getSuspensao <em>Suspensao</em>}</li>
 *   <li>{@link Model.Usuário#getAtendente <em>Atendente</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getUsuário()
 * @model
 * @generated
 */
public interface Usuário extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see Model.ModelPackage#getUsuário_Nome()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link Model.Usuário#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cadastro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cadastro</em>' attribute.
	 * @see #setCadastro(int)
	 * @see Model.ModelPackage#getUsuário_Cadastro()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCadastro();

	/**
	 * Sets the value of the '{@link Model.Usuário#getCadastro <em>Cadastro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cadastro</em>' attribute.
	 * @see #getCadastro()
	 * @generated
	 */
	void setCadastro(int value);

	/**
	 * Returns the value of the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instituto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instituto</em>' attribute.
	 * @see #setInstituto(String)
	 * @see Model.ModelPackage#getUsuário_Instituto()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getInstituto();

	/**
	 * Sets the value of the '{@link Model.Usuário#getInstituto <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instituto</em>' attribute.
	 * @see #getInstituto()
	 * @generated
	 */
	void setInstituto(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(int)
	 * @see Model.ModelPackage#getUsuário_Tipo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getTipo();

	/**
	 * Sets the value of the '{@link Model.Usuário#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(int value);

	/**
	 * Returns the value of the '<em><b>Suspensao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspensao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspensao</em>' attribute.
	 * @see #setSuspensao(int)
	 * @see Model.ModelPackage#getUsuário_Suspensao()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getSuspensao();

	/**
	 * Sets the value of the '{@link Model.Usuário#getSuspensao <em>Suspensao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspensao</em>' attribute.
	 * @see #getSuspensao()
	 * @generated
	 */
	void setSuspensao(int value);

	/**
	 * Returns the value of the '<em><b>Atendente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atendente</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atendente</em>' reference.
	 * @see #setAtendente(Atendente)
	 * @see Model.ModelPackage#getUsuário_Atendente()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Atendente getAtendente();

	/**
	 * Sets the value of the '{@link Model.Usuário#getAtendente <em>Atendente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atendente</em>' reference.
	 * @see #getAtendente()
	 * @generated
	 */
	void setAtendente(Atendente value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void emprestarPub();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void devolverPub();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reservar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancelarReserva();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSuspensao();

} // Usuário
