/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Exemplar#getPublicações <em>Publicações</em>}</li>
 *   <li>{@link Model.Exemplar#getTempoEmprestimo <em>Tempo Emprestimo</em>}</li>
 *   <li>{@link Model.Exemplar#isBloqueio <em>Bloqueio</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getExemplar()
 * @model
 * @generated
 */
public interface Exemplar extends Publicação {
	/**
	 * Returns the value of the '<em><b>Publicações</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publicações</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publicações</em>' reference.
	 * @see #setPublicações(Publicação)
	 * @see Model.ModelPackage#getExemplar_Publicações()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Publicação getPublicações();

	/**
	 * Sets the value of the '{@link Model.Exemplar#getPublicações <em>Publicações</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publicações</em>' reference.
	 * @see #getPublicações()
	 * @generated
	 */
	void setPublicações(Publicação value);

	/**
	 * Returns the value of the '<em><b>Tempo Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tempo Emprestimo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tempo Emprestimo</em>' attribute.
	 * @see #setTempoEmprestimo(int)
	 * @see Model.ModelPackage#getExemplar_TempoEmprestimo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getTempoEmprestimo();

	/**
	 * Sets the value of the '{@link Model.Exemplar#getTempoEmprestimo <em>Tempo Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tempo Emprestimo</em>' attribute.
	 * @see #getTempoEmprestimo()
	 * @generated
	 */
	void setTempoEmprestimo(int value);

	/**
	 * Returns the value of the '<em><b>Bloqueio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bloqueio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloqueio</em>' attribute.
	 * @see #setBloqueio(boolean)
	 * @see Model.ModelPackage#getExemplar_Bloqueio()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isBloqueio();

	/**
	 * Sets the value of the '{@link Model.Exemplar#isBloqueio <em>Bloqueio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bloqueio</em>' attribute.
	 * @see #isBloqueio()
	 * @generated
	 */
	void setBloqueio(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setTempoEmprestimo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setBloqueio();

} // Exemplar
