/**
 */
package model.impl;

import model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.INSTANCE: return createInstance();
			case ModelPackage.CONTEXT_RELATION: return createContextRelation();
			case ModelPackage.PRIMITIVE_EVENT: return createPrimitiveEvent();
			case ModelPackage.COMPLEX_EVENT: return createComplexEvent();
			case ModelPackage.BEHAVIOURAL_DESCRIPTION: return createBehaviouralDescription();
			case ModelPackage.HOLDS_AT: return createHoldsAt();
			case ModelPackage.HAPPENS: return createHappens();
			case ModelPackage.HOLDS_AT_BETWEEN: return createHoldsAtBetween();
			case ModelPackage.INITIALLY: return createInitially();
			case ModelPackage.ENVIRONMENT: return createEnvironment();
			case ModelPackage.OBSERVER_PARAM: return createObserverParam();
			case ModelPackage.AGENT_PARAM: return createAgentParam();
			case ModelPackage.HYPOTHESIS: return createHypothesis();
			case ModelPackage.GENERAL_PARAM: return createGeneralParam();
			case ModelPackage.AGENT: return createAgent();
			case ModelPackage.OBSERVER: return createObserver();
			case ModelPackage.AGENT_REFERENCE: return createAgentReference();
			case ModelPackage.OBSERVER_REFERENCE: return createObserverReference();
			case ModelPackage.GENERAL_TYPE_REFERENCE: return createGeneralTypeReference();
			case ModelPackage.GENERAL_TYPE: return createGeneralType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextRelation createContextRelation() {
		ContextRelationImpl contextRelation = new ContextRelationImpl();
		return contextRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveEvent createPrimitiveEvent() {
		PrimitiveEventImpl primitiveEvent = new PrimitiveEventImpl();
		return primitiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexEvent createComplexEvent() {
		ComplexEventImpl complexEvent = new ComplexEventImpl();
		return complexEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviouralDescription createBehaviouralDescription() {
		BehaviouralDescriptionImpl behaviouralDescription = new BehaviouralDescriptionImpl();
		return behaviouralDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HoldsAt createHoldsAt() {
		HoldsAtImpl holdsAt = new HoldsAtImpl();
		return holdsAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Happens createHappens() {
		HappensImpl happens = new HappensImpl();
		return happens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HoldsAtBetween createHoldsAtBetween() {
		HoldsAtBetweenImpl holdsAtBetween = new HoldsAtBetweenImpl();
		return holdsAtBetween;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initially createInitially() {
		InitiallyImpl initially = new InitiallyImpl();
		return initially;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserverParam createObserverParam() {
		ObserverParamImpl observerParam = new ObserverParamImpl();
		return observerParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentParam createAgentParam() {
		AgentParamImpl agentParam = new AgentParamImpl();
		return agentParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observer createObserver() {
		ObserverImpl observer = new ObserverImpl();
		return observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentReference createAgentReference() {
		AgentReferenceImpl agentReference = new AgentReferenceImpl();
		return agentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserverReference createObserverReference() {
		ObserverReferenceImpl observerReference = new ObserverReferenceImpl();
		return observerReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralTypeReference createGeneralTypeReference() {
		GeneralTypeReferenceImpl generalTypeReference = new GeneralTypeReferenceImpl();
		return generalTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralType createGeneralType() {
		GeneralTypeImpl generalType = new GeneralTypeImpl();
		return generalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypothesis createHypothesis() {
		HypothesisImpl hypothesis = new HypothesisImpl();
		return hypothesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralParam createGeneralParam() {
		GeneralParamImpl generalParam = new GeneralParamImpl();
		return generalParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
