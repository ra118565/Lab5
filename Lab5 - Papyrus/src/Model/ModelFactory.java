/**
 */
package Model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = Model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminal</em>'.
	 * @generated
	 */
	Terminal createTerminal();

	/**
	 * Returns a new object of class '<em>Publicação</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publicação</em>'.
	 * @generated
	 */
	Publicação createPublicação();

	/**
	 * Returns a new object of class '<em>Livro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Livro</em>'.
	 * @generated
	 */
	Livro createLivro();

	/**
	 * Returns a new object of class '<em>Periódico</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periódico</em>'.
	 * @generated
	 */
	Periódico createPeriódico();

	/**
	 * Returns a new object of class '<em>Tese</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tese</em>'.
	 * @generated
	 */
	Tese createTese();

	/**
	 * Returns a new object of class '<em>Exemplar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exemplar</em>'.
	 * @generated
	 */
	Exemplar createExemplar();

	/**
	 * Returns a new object of class '<em>Aluno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aluno</em>'.
	 * @generated
	 */
	Aluno createAluno();

	/**
	 * Returns a new object of class '<em>Usuário</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usuário</em>'.
	 * @generated
	 */
	Usuário createUsuário();

	/**
	 * Returns a new object of class '<em>Atendente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atendente</em>'.
	 * @generated
	 */
	Atendente createAtendente();

	/**
	 * Returns a new object of class '<em>Funcionário</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Funcionário</em>'.
	 * @generated
	 */
	Funcionário createFuncionário();

	/**
	 * Returns a new object of class '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professor</em>'.
	 * @generated
	 */
	Professor createProfessor();

	/**
	 * Returns a new object of class '<em>Bibliotecária</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bibliotecária</em>'.
	 * @generated
	 */
	Bibliotecária createBibliotecária();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
