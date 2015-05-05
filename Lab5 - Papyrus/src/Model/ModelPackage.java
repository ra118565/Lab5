/**
 */
package Model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = Model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link Model.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.TerminalImpl
	 * @see Model.impl.ModelPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 0;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Cadastrar Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___CADASTRAR_USUARIO = 0;

	/**
	 * The operation id for the '<em>Cancelar Reservas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___CANCELAR_RESERVAS = 1;

	/**
	 * The operation id for the '<em>Registra Emprest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___REGISTRA_EMPREST = 2;

	/**
	 * The operation id for the '<em>Suspender Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___SUSPENDER_USUARIO = 3;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link Model.impl.PublicaçãoImpl <em>Publicação</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.PublicaçãoImpl
	 * @see Model.impl.ModelPackageImpl#getPublicação()
	 * @generated
	 */
	int PUBLICAÇÃO = 1;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICAÇÃO__TITULO = 0;

	/**
	 * The feature id for the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICAÇÃO__ISBN = 1;

	/**
	 * The number of structural features of the '<em>Publicação</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICAÇÃO_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Set Titulo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICAÇÃO___SET_TITULO = 0;

	/**
	 * The operation id for the '<em>Set ISBN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICAÇÃO___SET_ISBN = 1;

	/**
	 * The number of operations of the '<em>Publicação</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICAÇÃO_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Model.impl.LivroImpl <em>Livro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.LivroImpl
	 * @see Model.impl.ModelPackageImpl#getLivro()
	 * @generated
	 */
	int LIVRO = 2;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__TITULO = PUBLICAÇÃO__TITULO;

	/**
	 * The feature id for the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__ISBN = PUBLICAÇÃO__ISBN;

	/**
	 * The number of structural features of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_FEATURE_COUNT = PUBLICAÇÃO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Titulo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO___SET_TITULO = PUBLICAÇÃO___SET_TITULO;

	/**
	 * The operation id for the '<em>Set ISBN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO___SET_ISBN = PUBLICAÇÃO___SET_ISBN;

	/**
	 * The number of operations of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_OPERATION_COUNT = PUBLICAÇÃO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.PeriódicoImpl <em>Periódico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.PeriódicoImpl
	 * @see Model.impl.ModelPackageImpl#getPeriódico()
	 * @generated
	 */
	int PERIÓDICO = 3;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO__TITULO = PUBLICAÇÃO__TITULO;

	/**
	 * The feature id for the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO__ISBN = PUBLICAÇÃO__ISBN;

	/**
	 * The number of structural features of the '<em>Periódico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO_FEATURE_COUNT = PUBLICAÇÃO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Titulo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO___SET_TITULO = PUBLICAÇÃO___SET_TITULO;

	/**
	 * The operation id for the '<em>Set ISBN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO___SET_ISBN = PUBLICAÇÃO___SET_ISBN;

	/**
	 * The number of operations of the '<em>Periódico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO_OPERATION_COUNT = PUBLICAÇÃO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.TeseImpl <em>Tese</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.TeseImpl
	 * @see Model.impl.ModelPackageImpl#getTese()
	 * @generated
	 */
	int TESE = 4;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__TITULO = PUBLICAÇÃO__TITULO;

	/**
	 * The feature id for the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__ISBN = PUBLICAÇÃO__ISBN;

	/**
	 * The number of structural features of the '<em>Tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_FEATURE_COUNT = PUBLICAÇÃO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Titulo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE___SET_TITULO = PUBLICAÇÃO___SET_TITULO;

	/**
	 * The operation id for the '<em>Set ISBN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE___SET_ISBN = PUBLICAÇÃO___SET_ISBN;

	/**
	 * The number of operations of the '<em>Tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_OPERATION_COUNT = PUBLICAÇÃO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.ExemplarImpl <em>Exemplar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ExemplarImpl
	 * @see Model.impl.ModelPackageImpl#getExemplar()
	 * @generated
	 */
	int EXEMPLAR = 5;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__TITULO = PUBLICAÇÃO__TITULO;

	/**
	 * The feature id for the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__ISBN = PUBLICAÇÃO__ISBN;

	/**
	 * The feature id for the '<em><b>Publicações</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__PUBLICAÇÕES = PUBLICAÇÃO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tempo Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__TEMPO_EMPRESTIMO = PUBLICAÇÃO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bloqueio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__BLOQUEIO = PUBLICAÇÃO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_FEATURE_COUNT = PUBLICAÇÃO_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Titulo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR___SET_TITULO = PUBLICAÇÃO___SET_TITULO;

	/**
	 * The operation id for the '<em>Set ISBN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR___SET_ISBN = PUBLICAÇÃO___SET_ISBN;

	/**
	 * The operation id for the '<em>Set Tempo Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR___SET_TEMPO_EMPRESTIMO = PUBLICAÇÃO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Bloqueio</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR___SET_BLOQUEIO = PUBLICAÇÃO_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_OPERATION_COUNT = PUBLICAÇÃO_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Model.impl.UsuárioImpl <em>Usuário</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.UsuárioImpl
	 * @see Model.impl.ModelPackageImpl#getUsuário()
	 * @generated
	 */
	int USUÁRIO = 7;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__CADASTRO = 1;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__INSTITUTO = 2;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__TIPO = 3;

	/**
	 * The feature id for the '<em><b>Suspensao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__SUSPENSAO = 4;

	/**
	 * The feature id for the '<em><b>Atendente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__ATENDENTE = 5;

	/**
	 * The number of structural features of the '<em>Usuário</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Emprestar Pub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO___EMPRESTAR_PUB = 0;

	/**
	 * The operation id for the '<em>Devolver Pub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO___DEVOLVER_PUB = 1;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO___RESERVAR = 2;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO___CANCELAR_RESERVA = 3;

	/**
	 * The operation id for the '<em>Set Suspensao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO___SET_SUSPENSAO = 4;

	/**
	 * The number of operations of the '<em>Usuário</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link Model.impl.AlunoImpl <em>Aluno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.AlunoImpl
	 * @see Model.impl.ModelPackageImpl#getAluno()
	 * @generated
	 */
	int ALUNO = 6;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__NOME = USUÁRIO__NOME;

	/**
	 * The feature id for the '<em><b>Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CADASTRO = USUÁRIO__CADASTRO;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__INSTITUTO = USUÁRIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__TIPO = USUÁRIO__TIPO;

	/**
	 * The feature id for the '<em><b>Suspensao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__SUSPENSAO = USUÁRIO__SUSPENSAO;

	/**
	 * The feature id for the '<em><b>Atendente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ATENDENTE = USUÁRIO__ATENDENTE;

	/**
	 * The number of structural features of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_FEATURE_COUNT = USUÁRIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Emprestar Pub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___EMPRESTAR_PUB = USUÁRIO___EMPRESTAR_PUB;

	/**
	 * The operation id for the '<em>Devolver Pub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___DEVOLVER_PUB = USUÁRIO___DEVOLVER_PUB;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___RESERVAR = USUÁRIO___RESERVAR;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___CANCELAR_RESERVA = USUÁRIO___CANCELAR_RESERVA;

	/**
	 * The operation id for the '<em>Set Suspensao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___SET_SUSPENSAO = USUÁRIO___SET_SUSPENSAO;

	/**
	 * The number of operations of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_OPERATION_COUNT = USUÁRIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.FuncionárioImpl <em>Funcionário</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.FuncionárioImpl
	 * @see Model.impl.ModelPackageImpl#getFuncionário()
	 * @generated
	 */
	int FUNCIONÁRIO = 9;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO__NOME = USUÁRIO__NOME;

	/**
	 * The feature id for the '<em><b>Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO__CADASTRO = USUÁRIO__CADASTRO;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO__INSTITUTO = USUÁRIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO__TIPO = USUÁRIO__TIPO;

	/**
	 * The feature id for the '<em><b>Suspensao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO__SUSPENSAO = USUÁRIO__SUSPENSAO;

	/**
	 * The feature id for the '<em><b>Atendente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO__ATENDENTE = USUÁRIO__ATENDENTE;

	/**
	 * The number of structural features of the '<em>Funcionário</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO_FEATURE_COUNT = USUÁRIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Emprestar Pub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO___EMPRESTAR_PUB = USUÁRIO___EMPRESTAR_PUB;

	/**
	 * The operation id for the '<em>Devolver Pub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO___DEVOLVER_PUB = USUÁRIO___DEVOLVER_PUB;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO___RESERVAR = USUÁRIO___RESERVAR;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO___CANCELAR_RESERVA = USUÁRIO___CANCELAR_RESERVA;

	/**
	 * The operation id for the '<em>Set Suspensao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO___SET_SUSPENSAO = USUÁRIO___SET_SUSPENSAO;

	/**
	 * The number of operations of the '<em>Funcionário</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO_OPERATION_COUNT = USUÁRIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.AtendenteImpl <em>Atendente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.AtendenteImpl
	 * @see Model.impl.ModelPackageImpl#getAtendente()
	 * @generated
	 */
	int ATENDENTE = 8;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__NOME = FUNCIONÁRIO__NOME;

	/**
	 * The feature id for the '<em><b>Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__CADASTRO = FUNCIONÁRIO__CADASTRO;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__INSTITUTO = FUNCIONÁRIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__TIPO = FUNCIONÁRIO__TIPO;

	/**
	 * The feature id for the '<em><b>Suspensao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__SUSPENSAO = FUNCIONÁRIO__SUSPENSAO;

	/**
	 * The feature id for the '<em><b>Atendente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__ATENDENTE = FUNCIONÁRIO__ATENDENTE;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__TERMINAL = FUNCIONÁRIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atendente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE_FEATURE_COUNT = FUNCIONÁRIO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Emprestar Pub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___EMPRESTAR_PUB = FUNCIONÁRIO___EMPRESTAR_PUB;

	/**
	 * The operation id for the '<em>Devolver Pub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___DEVOLVER_PUB = FUNCIONÁRIO___DEVOLVER_PUB;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___RESERVAR = FUNCIONÁRIO___RESERVAR;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___CANCELAR_RESERVA = FUNCIONÁRIO___CANCELAR_RESERVA;

	/**
	 * The operation id for the '<em>Set Suspensao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___SET_SUSPENSAO = FUNCIONÁRIO___SET_SUSPENSAO;

	/**
	 * The operation id for the '<em>Acessar Terminal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___ACESSAR_TERMINAL = FUNCIONÁRIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Calcular Multa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___CALCULAR_MULTA = FUNCIONÁRIO_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Atendente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE_OPERATION_COUNT = FUNCIONÁRIO_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Model.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ProfessorImpl
	 * @see Model.impl.ModelPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 10;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NOME = USUÁRIO__NOME;

	/**
	 * The feature id for the '<em><b>Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CADASTRO = USUÁRIO__CADASTRO;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__INSTITUTO = USUÁRIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TIPO = USUÁRIO__TIPO;

	/**
	 * The feature id for the '<em><b>Suspensao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__SUSPENSAO = USUÁRIO__SUSPENSAO;

	/**
	 * The feature id for the '<em><b>Atendente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ATENDENTE = USUÁRIO__ATENDENTE;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = USUÁRIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Emprestar Pub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___EMPRESTAR_PUB = USUÁRIO___EMPRESTAR_PUB;

	/**
	 * The operation id for the '<em>Devolver Pub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___DEVOLVER_PUB = USUÁRIO___DEVOLVER_PUB;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___RESERVAR = USUÁRIO___RESERVAR;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___CANCELAR_RESERVA = USUÁRIO___CANCELAR_RESERVA;

	/**
	 * The operation id for the '<em>Set Suspensao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___SET_SUSPENSAO = USUÁRIO___SET_SUSPENSAO;

	/**
	 * The operation id for the '<em>Bloquear Pub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___BLOQUEAR_PUB = USUÁRIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Desbloquear Pub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___DESBLOQUEAR_PUB = USUÁRIO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Emprestar Pub15</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___EMPRESTAR_PUB15 = USUÁRIO_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = USUÁRIO_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link Model.impl.BibliotecáriaImpl <em>Bibliotecária</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.BibliotecáriaImpl
	 * @see Model.impl.ModelPackageImpl#getBibliotecária()
	 * @generated
	 */
	int BIBLIOTECÁRIA = 11;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA__NOME = FUNCIONÁRIO__NOME;

	/**
	 * The feature id for the '<em><b>Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA__CADASTRO = FUNCIONÁRIO__CADASTRO;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA__INSTITUTO = FUNCIONÁRIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA__TIPO = FUNCIONÁRIO__TIPO;

	/**
	 * The feature id for the '<em><b>Suspensao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA__SUSPENSAO = FUNCIONÁRIO__SUSPENSAO;

	/**
	 * The feature id for the '<em><b>Atendente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA__ATENDENTE = FUNCIONÁRIO__ATENDENTE;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA__TERMINAL = FUNCIONÁRIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exemplar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA__EXEMPLAR = FUNCIONÁRIO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bibliotecária</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA_FEATURE_COUNT = FUNCIONÁRIO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Emprestar Pub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA___EMPRESTAR_PUB = FUNCIONÁRIO___EMPRESTAR_PUB;

	/**
	 * The operation id for the '<em>Devolver Pub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA___DEVOLVER_PUB = FUNCIONÁRIO___DEVOLVER_PUB;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA___RESERVAR = FUNCIONÁRIO___RESERVAR;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA___CANCELAR_RESERVA = FUNCIONÁRIO___CANCELAR_RESERVA;

	/**
	 * The operation id for the '<em>Set Suspensao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA___SET_SUSPENSAO = FUNCIONÁRIO___SET_SUSPENSAO;

	/**
	 * The operation id for the '<em>Inclusao Exemplares</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA___INCLUSAO_EXEMPLARES = FUNCIONÁRIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Atualizacao Dados</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA___ATUALIZACAO_DADOS = FUNCIONÁRIO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Exclusao Exemplares</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA___EXCLUSAO_EXEMPLARES = FUNCIONÁRIO_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Acessar Terminal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA___ACESSAR_TERMINAL = FUNCIONÁRIO_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bibliotecária</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA_OPERATION_COUNT = FUNCIONÁRIO_OPERATION_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link Model.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see Model.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the '{@link Model.Terminal#cadastrarUsuario() <em>Cadastrar Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cadastrar Usuario</em>' operation.
	 * @see Model.Terminal#cadastrarUsuario()
	 * @generated
	 */
	EOperation getTerminal__CadastrarUsuario();

	/**
	 * Returns the meta object for the '{@link Model.Terminal#cancelarReservas() <em>Cancelar Reservas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancelar Reservas</em>' operation.
	 * @see Model.Terminal#cancelarReservas()
	 * @generated
	 */
	EOperation getTerminal__CancelarReservas();

	/**
	 * Returns the meta object for the '{@link Model.Terminal#registraEmprest() <em>Registra Emprest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Registra Emprest</em>' operation.
	 * @see Model.Terminal#registraEmprest()
	 * @generated
	 */
	EOperation getTerminal__RegistraEmprest();

	/**
	 * Returns the meta object for the '{@link Model.Terminal#suspenderUsuario() <em>Suspender Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Suspender Usuario</em>' operation.
	 * @see Model.Terminal#suspenderUsuario()
	 * @generated
	 */
	EOperation getTerminal__SuspenderUsuario();

	/**
	 * Returns the meta object for class '{@link Model.Publicação <em>Publicação</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publicação</em>'.
	 * @see Model.Publicação
	 * @generated
	 */
	EClass getPublicação();

	/**
	 * Returns the meta object for the attribute '{@link Model.Publicação#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see Model.Publicação#getTitulo()
	 * @see #getPublicação()
	 * @generated
	 */
	EAttribute getPublicação_Titulo();

	/**
	 * Returns the meta object for the attribute '{@link Model.Publicação#getISBN <em>ISBN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISBN</em>'.
	 * @see Model.Publicação#getISBN()
	 * @see #getPublicação()
	 * @generated
	 */
	EAttribute getPublicação_ISBN();

	/**
	 * Returns the meta object for the '{@link Model.Publicação#setTitulo() <em>Set Titulo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Titulo</em>' operation.
	 * @see Model.Publicação#setTitulo()
	 * @generated
	 */
	EOperation getPublicação__SetTitulo();

	/**
	 * Returns the meta object for the '{@link Model.Publicação#setISBN() <em>Set ISBN</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set ISBN</em>' operation.
	 * @see Model.Publicação#setISBN()
	 * @generated
	 */
	EOperation getPublicação__SetISBN();

	/**
	 * Returns the meta object for class '{@link Model.Livro <em>Livro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Livro</em>'.
	 * @see Model.Livro
	 * @generated
	 */
	EClass getLivro();

	/**
	 * Returns the meta object for class '{@link Model.Periódico <em>Periódico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periódico</em>'.
	 * @see Model.Periódico
	 * @generated
	 */
	EClass getPeriódico();

	/**
	 * Returns the meta object for class '{@link Model.Tese <em>Tese</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tese</em>'.
	 * @see Model.Tese
	 * @generated
	 */
	EClass getTese();

	/**
	 * Returns the meta object for class '{@link Model.Exemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exemplar</em>'.
	 * @see Model.Exemplar
	 * @generated
	 */
	EClass getExemplar();

	/**
	 * Returns the meta object for the reference '{@link Model.Exemplar#getPublicações <em>Publicações</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publicações</em>'.
	 * @see Model.Exemplar#getPublicações()
	 * @see #getExemplar()
	 * @generated
	 */
	EReference getExemplar_Publicações();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#getTempoEmprestimo <em>Tempo Emprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tempo Emprestimo</em>'.
	 * @see Model.Exemplar#getTempoEmprestimo()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_TempoEmprestimo();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#isBloqueio <em>Bloqueio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bloqueio</em>'.
	 * @see Model.Exemplar#isBloqueio()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Bloqueio();

	/**
	 * Returns the meta object for the '{@link Model.Exemplar#setTempoEmprestimo() <em>Set Tempo Emprestimo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Tempo Emprestimo</em>' operation.
	 * @see Model.Exemplar#setTempoEmprestimo()
	 * @generated
	 */
	EOperation getExemplar__SetTempoEmprestimo();

	/**
	 * Returns the meta object for the '{@link Model.Exemplar#setBloqueio() <em>Set Bloqueio</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Bloqueio</em>' operation.
	 * @see Model.Exemplar#setBloqueio()
	 * @generated
	 */
	EOperation getExemplar__SetBloqueio();

	/**
	 * Returns the meta object for class '{@link Model.Aluno <em>Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aluno</em>'.
	 * @see Model.Aluno
	 * @generated
	 */
	EClass getAluno();

	/**
	 * Returns the meta object for class '{@link Model.Usuário <em>Usuário</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuário</em>'.
	 * @see Model.Usuário
	 * @generated
	 */
	EClass getUsuário();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuário#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Model.Usuário#getNome()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Nome();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuário#getCadastro <em>Cadastro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cadastro</em>'.
	 * @see Model.Usuário#getCadastro()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Cadastro();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuário#getInstituto <em>Instituto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instituto</em>'.
	 * @see Model.Usuário#getInstituto()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Instituto();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuário#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see Model.Usuário#getTipo()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuário#getSuspensao <em>Suspensao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspensao</em>'.
	 * @see Model.Usuário#getSuspensao()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Suspensao();

	/**
	 * Returns the meta object for the reference '{@link Model.Usuário#getAtendente <em>Atendente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atendente</em>'.
	 * @see Model.Usuário#getAtendente()
	 * @see #getUsuário()
	 * @generated
	 */
	EReference getUsuário_Atendente();

	/**
	 * Returns the meta object for the '{@link Model.Usuário#emprestarPub() <em>Emprestar Pub</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Emprestar Pub</em>' operation.
	 * @see Model.Usuário#emprestarPub()
	 * @generated
	 */
	EOperation getUsuário__EmprestarPub();

	/**
	 * Returns the meta object for the '{@link Model.Usuário#devolverPub() <em>Devolver Pub</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Devolver Pub</em>' operation.
	 * @see Model.Usuário#devolverPub()
	 * @generated
	 */
	EOperation getUsuário__DevolverPub();

	/**
	 * Returns the meta object for the '{@link Model.Usuário#reservar() <em>Reservar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reservar</em>' operation.
	 * @see Model.Usuário#reservar()
	 * @generated
	 */
	EOperation getUsuário__Reservar();

	/**
	 * Returns the meta object for the '{@link Model.Usuário#cancelarReserva() <em>Cancelar Reserva</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancelar Reserva</em>' operation.
	 * @see Model.Usuário#cancelarReserva()
	 * @generated
	 */
	EOperation getUsuário__CancelarReserva();

	/**
	 * Returns the meta object for the '{@link Model.Usuário#setSuspensao() <em>Set Suspensao</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Suspensao</em>' operation.
	 * @see Model.Usuário#setSuspensao()
	 * @generated
	 */
	EOperation getUsuário__SetSuspensao();

	/**
	 * Returns the meta object for class '{@link Model.Atendente <em>Atendente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atendente</em>'.
	 * @see Model.Atendente
	 * @generated
	 */
	EClass getAtendente();

	/**
	 * Returns the meta object for the reference '{@link Model.Atendente#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see Model.Atendente#getTerminal()
	 * @see #getAtendente()
	 * @generated
	 */
	EReference getAtendente_Terminal();

	/**
	 * Returns the meta object for the '{@link Model.Atendente#acessarTerminal() <em>Acessar Terminal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acessar Terminal</em>' operation.
	 * @see Model.Atendente#acessarTerminal()
	 * @generated
	 */
	EOperation getAtendente__AcessarTerminal();

	/**
	 * Returns the meta object for the '{@link Model.Atendente#calcularMulta() <em>Calcular Multa</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcular Multa</em>' operation.
	 * @see Model.Atendente#calcularMulta()
	 * @generated
	 */
	EOperation getAtendente__CalcularMulta();

	/**
	 * Returns the meta object for class '{@link Model.Funcionário <em>Funcionário</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcionário</em>'.
	 * @see Model.Funcionário
	 * @generated
	 */
	EClass getFuncionário();

	/**
	 * Returns the meta object for class '{@link Model.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see Model.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for the '{@link Model.Professor#bloquearPub() <em>Bloquear Pub</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bloquear Pub</em>' operation.
	 * @see Model.Professor#bloquearPub()
	 * @generated
	 */
	EOperation getProfessor__BloquearPub();

	/**
	 * Returns the meta object for the '{@link Model.Professor#desbloquearPub() <em>Desbloquear Pub</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Desbloquear Pub</em>' operation.
	 * @see Model.Professor#desbloquearPub()
	 * @generated
	 */
	EOperation getProfessor__DesbloquearPub();

	/**
	 * Returns the meta object for the '{@link Model.Professor#emprestarPub15() <em>Emprestar Pub15</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Emprestar Pub15</em>' operation.
	 * @see Model.Professor#emprestarPub15()
	 * @generated
	 */
	EOperation getProfessor__EmprestarPub15();

	/**
	 * Returns the meta object for class '{@link Model.Bibliotecária <em>Bibliotecária</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bibliotecária</em>'.
	 * @see Model.Bibliotecária
	 * @generated
	 */
	EClass getBibliotecária();

	/**
	 * Returns the meta object for the reference '{@link Model.Bibliotecária#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see Model.Bibliotecária#getTerminal()
	 * @see #getBibliotecária()
	 * @generated
	 */
	EReference getBibliotecária_Terminal();

	/**
	 * Returns the meta object for the reference '{@link Model.Bibliotecária#getExemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exemplar</em>'.
	 * @see Model.Bibliotecária#getExemplar()
	 * @see #getBibliotecária()
	 * @generated
	 */
	EReference getBibliotecária_Exemplar();

	/**
	 * Returns the meta object for the '{@link Model.Bibliotecária#inclusaoExemplares() <em>Inclusao Exemplares</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inclusao Exemplares</em>' operation.
	 * @see Model.Bibliotecária#inclusaoExemplares()
	 * @generated
	 */
	EOperation getBibliotecária__InclusaoExemplares();

	/**
	 * Returns the meta object for the '{@link Model.Bibliotecária#atualizacaoDados() <em>Atualizacao Dados</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Atualizacao Dados</em>' operation.
	 * @see Model.Bibliotecária#atualizacaoDados()
	 * @generated
	 */
	EOperation getBibliotecária__AtualizacaoDados();

	/**
	 * Returns the meta object for the '{@link Model.Bibliotecária#exclusaoExemplares() <em>Exclusao Exemplares</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exclusao Exemplares</em>' operation.
	 * @see Model.Bibliotecária#exclusaoExemplares()
	 * @generated
	 */
	EOperation getBibliotecária__ExclusaoExemplares();

	/**
	 * Returns the meta object for the '{@link Model.Bibliotecária#acessarTerminal() <em>Acessar Terminal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acessar Terminal</em>' operation.
	 * @see Model.Bibliotecária#acessarTerminal()
	 * @generated
	 */
	EOperation getBibliotecária__AcessarTerminal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Model.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.TerminalImpl
		 * @see Model.impl.ModelPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Cadastrar Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___CADASTRAR_USUARIO = eINSTANCE.getTerminal__CadastrarUsuario();

		/**
		 * The meta object literal for the '<em><b>Cancelar Reservas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___CANCELAR_RESERVAS = eINSTANCE.getTerminal__CancelarReservas();

		/**
		 * The meta object literal for the '<em><b>Registra Emprest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___REGISTRA_EMPREST = eINSTANCE.getTerminal__RegistraEmprest();

		/**
		 * The meta object literal for the '<em><b>Suspender Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___SUSPENDER_USUARIO = eINSTANCE.getTerminal__SuspenderUsuario();

		/**
		 * The meta object literal for the '{@link Model.impl.PublicaçãoImpl <em>Publicação</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.PublicaçãoImpl
		 * @see Model.impl.ModelPackageImpl#getPublicação()
		 * @generated
		 */
		EClass PUBLICAÇÃO = eINSTANCE.getPublicação();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICAÇÃO__TITULO = eINSTANCE.getPublicação_Titulo();

		/**
		 * The meta object literal for the '<em><b>ISBN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICAÇÃO__ISBN = eINSTANCE.getPublicação_ISBN();

		/**
		 * The meta object literal for the '<em><b>Set Titulo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUBLICAÇÃO___SET_TITULO = eINSTANCE.getPublicação__SetTitulo();

		/**
		 * The meta object literal for the '<em><b>Set ISBN</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUBLICAÇÃO___SET_ISBN = eINSTANCE.getPublicação__SetISBN();

		/**
		 * The meta object literal for the '{@link Model.impl.LivroImpl <em>Livro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.LivroImpl
		 * @see Model.impl.ModelPackageImpl#getLivro()
		 * @generated
		 */
		EClass LIVRO = eINSTANCE.getLivro();

		/**
		 * The meta object literal for the '{@link Model.impl.PeriódicoImpl <em>Periódico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.PeriódicoImpl
		 * @see Model.impl.ModelPackageImpl#getPeriódico()
		 * @generated
		 */
		EClass PERIÓDICO = eINSTANCE.getPeriódico();

		/**
		 * The meta object literal for the '{@link Model.impl.TeseImpl <em>Tese</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.TeseImpl
		 * @see Model.impl.ModelPackageImpl#getTese()
		 * @generated
		 */
		EClass TESE = eINSTANCE.getTese();

		/**
		 * The meta object literal for the '{@link Model.impl.ExemplarImpl <em>Exemplar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ExemplarImpl
		 * @see Model.impl.ModelPackageImpl#getExemplar()
		 * @generated
		 */
		EClass EXEMPLAR = eINSTANCE.getExemplar();

		/**
		 * The meta object literal for the '<em><b>Publicações</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEMPLAR__PUBLICAÇÕES = eINSTANCE.getExemplar_Publicações();

		/**
		 * The meta object literal for the '<em><b>Tempo Emprestimo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__TEMPO_EMPRESTIMO = eINSTANCE.getExemplar_TempoEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Bloqueio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__BLOQUEIO = eINSTANCE.getExemplar_Bloqueio();

		/**
		 * The meta object literal for the '<em><b>Set Tempo Emprestimo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXEMPLAR___SET_TEMPO_EMPRESTIMO = eINSTANCE.getExemplar__SetTempoEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Set Bloqueio</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXEMPLAR___SET_BLOQUEIO = eINSTANCE.getExemplar__SetBloqueio();

		/**
		 * The meta object literal for the '{@link Model.impl.AlunoImpl <em>Aluno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.AlunoImpl
		 * @see Model.impl.ModelPackageImpl#getAluno()
		 * @generated
		 */
		EClass ALUNO = eINSTANCE.getAluno();

		/**
		 * The meta object literal for the '{@link Model.impl.UsuárioImpl <em>Usuário</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.UsuárioImpl
		 * @see Model.impl.ModelPackageImpl#getUsuário()
		 * @generated
		 */
		EClass USUÁRIO = eINSTANCE.getUsuário();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__NOME = eINSTANCE.getUsuário_Nome();

		/**
		 * The meta object literal for the '<em><b>Cadastro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__CADASTRO = eINSTANCE.getUsuário_Cadastro();

		/**
		 * The meta object literal for the '<em><b>Instituto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__INSTITUTO = eINSTANCE.getUsuário_Instituto();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__TIPO = eINSTANCE.getUsuário_Tipo();

		/**
		 * The meta object literal for the '<em><b>Suspensao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__SUSPENSAO = eINSTANCE.getUsuário_Suspensao();

		/**
		 * The meta object literal for the '<em><b>Atendente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUÁRIO__ATENDENTE = eINSTANCE.getUsuário_Atendente();

		/**
		 * The meta object literal for the '<em><b>Emprestar Pub</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUÁRIO___EMPRESTAR_PUB = eINSTANCE.getUsuário__EmprestarPub();

		/**
		 * The meta object literal for the '<em><b>Devolver Pub</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUÁRIO___DEVOLVER_PUB = eINSTANCE.getUsuário__DevolverPub();

		/**
		 * The meta object literal for the '<em><b>Reservar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUÁRIO___RESERVAR = eINSTANCE.getUsuário__Reservar();

		/**
		 * The meta object literal for the '<em><b>Cancelar Reserva</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUÁRIO___CANCELAR_RESERVA = eINSTANCE.getUsuário__CancelarReserva();

		/**
		 * The meta object literal for the '<em><b>Set Suspensao</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUÁRIO___SET_SUSPENSAO = eINSTANCE.getUsuário__SetSuspensao();

		/**
		 * The meta object literal for the '{@link Model.impl.AtendenteImpl <em>Atendente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.AtendenteImpl
		 * @see Model.impl.ModelPackageImpl#getAtendente()
		 * @generated
		 */
		EClass ATENDENTE = eINSTANCE.getAtendente();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATENDENTE__TERMINAL = eINSTANCE.getAtendente_Terminal();

		/**
		 * The meta object literal for the '<em><b>Acessar Terminal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATENDENTE___ACESSAR_TERMINAL = eINSTANCE.getAtendente__AcessarTerminal();

		/**
		 * The meta object literal for the '<em><b>Calcular Multa</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATENDENTE___CALCULAR_MULTA = eINSTANCE.getAtendente__CalcularMulta();

		/**
		 * The meta object literal for the '{@link Model.impl.FuncionárioImpl <em>Funcionário</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.FuncionárioImpl
		 * @see Model.impl.ModelPackageImpl#getFuncionário()
		 * @generated
		 */
		EClass FUNCIONÁRIO = eINSTANCE.getFuncionário();

		/**
		 * The meta object literal for the '{@link Model.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ProfessorImpl
		 * @see Model.impl.ModelPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '<em><b>Bloquear Pub</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___BLOQUEAR_PUB = eINSTANCE.getProfessor__BloquearPub();

		/**
		 * The meta object literal for the '<em><b>Desbloquear Pub</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___DESBLOQUEAR_PUB = eINSTANCE.getProfessor__DesbloquearPub();

		/**
		 * The meta object literal for the '<em><b>Emprestar Pub15</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___EMPRESTAR_PUB15 = eINSTANCE.getProfessor__EmprestarPub15();

		/**
		 * The meta object literal for the '{@link Model.impl.BibliotecáriaImpl <em>Bibliotecária</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.BibliotecáriaImpl
		 * @see Model.impl.ModelPackageImpl#getBibliotecária()
		 * @generated
		 */
		EClass BIBLIOTECÁRIA = eINSTANCE.getBibliotecária();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOTECÁRIA__TERMINAL = eINSTANCE.getBibliotecária_Terminal();

		/**
		 * The meta object literal for the '<em><b>Exemplar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOTECÁRIA__EXEMPLAR = eINSTANCE.getBibliotecária_Exemplar();

		/**
		 * The meta object literal for the '<em><b>Inclusao Exemplares</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECÁRIA___INCLUSAO_EXEMPLARES = eINSTANCE.getBibliotecária__InclusaoExemplares();

		/**
		 * The meta object literal for the '<em><b>Atualizacao Dados</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECÁRIA___ATUALIZACAO_DADOS = eINSTANCE.getBibliotecária__AtualizacaoDados();

		/**
		 * The meta object literal for the '<em><b>Exclusao Exemplares</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECÁRIA___EXCLUSAO_EXEMPLARES = eINSTANCE.getBibliotecária__ExclusaoExemplares();

		/**
		 * The meta object literal for the '<em><b>Acessar Terminal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECÁRIA___ACESSAR_TERMINAL = eINSTANCE.getBibliotecária__AcessarTerminal();

	}

} //ModelPackage
