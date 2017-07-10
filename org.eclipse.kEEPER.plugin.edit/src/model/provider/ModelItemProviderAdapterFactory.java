/**
 */
package model.provider;

import java.util.ArrayList;
import java.util.Collection;

import model.util.ModelAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProviderAdapterFactory extends ModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Instance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceItemProvider instanceItemProvider;

	/**
	 * This creates an adapter for a {@link model.Instance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstanceAdapter() {
		if (instanceItemProvider == null) {
			instanceItemProvider = new InstanceItemProvider(this);
		}

		return instanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.ContextRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextRelationItemProvider contextRelationItemProvider;

	/**
	 * This creates an adapter for a {@link model.ContextRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContextRelationAdapter() {
		if (contextRelationItemProvider == null) {
			contextRelationItemProvider = new ContextRelationItemProvider(this);
		}

		return contextRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.PrimitiveEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveEventItemProvider primitiveEventItemProvider;

	/**
	 * This creates an adapter for a {@link model.PrimitiveEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveEventAdapter() {
		if (primitiveEventItemProvider == null) {
			primitiveEventItemProvider = new PrimitiveEventItemProvider(this);
		}

		return primitiveEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.ComplexEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexEventItemProvider complexEventItemProvider;

	/**
	 * This creates an adapter for a {@link model.ComplexEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComplexEventAdapter() {
		if (complexEventItemProvider == null) {
			complexEventItemProvider = new ComplexEventItemProvider(this);
		}

		return complexEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.BehaviouralDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviouralDescriptionItemProvider behaviouralDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link model.BehaviouralDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBehaviouralDescriptionAdapter() {
		if (behaviouralDescriptionItemProvider == null) {
			behaviouralDescriptionItemProvider = new BehaviouralDescriptionItemProvider(this);
		}

		return behaviouralDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.HoldsAt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HoldsAtItemProvider holdsAtItemProvider;

	/**
	 * This creates an adapter for a {@link model.HoldsAt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHoldsAtAdapter() {
		if (holdsAtItemProvider == null) {
			holdsAtItemProvider = new HoldsAtItemProvider(this);
		}

		return holdsAtItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Happens} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HappensItemProvider happensItemProvider;

	/**
	 * This creates an adapter for a {@link model.Happens}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHappensAdapter() {
		if (happensItemProvider == null) {
			happensItemProvider = new HappensItemProvider(this);
		}

		return happensItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.HoldsAtBetween} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HoldsAtBetweenItemProvider holdsAtBetweenItemProvider;

	/**
	 * This creates an adapter for a {@link model.HoldsAtBetween}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHoldsAtBetweenAdapter() {
		if (holdsAtBetweenItemProvider == null) {
			holdsAtBetweenItemProvider = new HoldsAtBetweenItemProvider(this);
		}

		return holdsAtBetweenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Initially} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitiallyItemProvider initiallyItemProvider;

	/**
	 * This creates an adapter for a {@link model.Initially}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInitiallyAdapter() {
		if (initiallyItemProvider == null) {
			initiallyItemProvider = new InitiallyItemProvider(this);
		}

		return initiallyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Environment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentItemProvider environmentItemProvider;

	/**
	 * This creates an adapter for a {@link model.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnvironmentAdapter() {
		if (environmentItemProvider == null) {
			environmentItemProvider = new EnvironmentItemProvider(this);
		}

		return environmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.ObserverParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObserverParamItemProvider observerParamItemProvider;

	/**
	 * This creates an adapter for a {@link model.ObserverParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObserverParamAdapter() {
		if (observerParamItemProvider == null) {
			observerParamItemProvider = new ObserverParamItemProvider(this);
		}

		return observerParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.AgentParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentParamItemProvider agentParamItemProvider;

	/**
	 * This creates an adapter for a {@link model.AgentParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAgentParamAdapter() {
		if (agentParamItemProvider == null) {
			agentParamItemProvider = new AgentParamItemProvider(this);
		}

		return agentParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Observer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObserverItemProvider observerItemProvider;

	/**
	 * This creates an adapter for a {@link model.Observer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObserverAdapter() {
		if (observerItemProvider == null) {
			observerItemProvider = new ObserverItemProvider(this);
		}

		return observerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.AgentReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentReferenceItemProvider agentReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link model.AgentReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAgentReferenceAdapter() {
		if (agentReferenceItemProvider == null) {
			agentReferenceItemProvider = new AgentReferenceItemProvider(this);
		}

		return agentReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.ObserverReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObserverReferenceItemProvider observerReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link model.ObserverReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObserverReferenceAdapter() {
		if (observerReferenceItemProvider == null) {
			observerReferenceItemProvider = new ObserverReferenceItemProvider(this);
		}

		return observerReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.GeneralTypeReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralTypeReferenceItemProvider generalTypeReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link model.GeneralTypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneralTypeReferenceAdapter() {
		if (generalTypeReferenceItemProvider == null) {
			generalTypeReferenceItemProvider = new GeneralTypeReferenceItemProvider(this);
		}

		return generalTypeReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.GeneralType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralTypeItemProvider generalTypeItemProvider;

	/**
	 * This creates an adapter for a {@link model.GeneralType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneralTypeAdapter() {
		if (generalTypeItemProvider == null) {
			generalTypeItemProvider = new GeneralTypeItemProvider(this);
		}

		return generalTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Agent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentItemProvider agentItemProvider;

	/**
	 * This creates an adapter for a {@link model.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAgentAdapter() {
		if (agentItemProvider == null) {
			agentItemProvider = new AgentItemProvider(this);
		}

		return agentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.Hypothesis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HypothesisItemProvider hypothesisItemProvider;

	/**
	 * This creates an adapter for a {@link model.Hypothesis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHypothesisAdapter() {
		if (hypothesisItemProvider == null) {
			hypothesisItemProvider = new HypothesisItemProvider(this);
		}

		return hypothesisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link model.GeneralParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralParamItemProvider generalParamItemProvider;

	/**
	 * This creates an adapter for a {@link model.GeneralParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneralParamAdapter() {
		if (generalParamItemProvider == null) {
			generalParamItemProvider = new GeneralParamItemProvider(this);
		}

		return generalParamItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (instanceItemProvider != null) instanceItemProvider.dispose();
		if (contextRelationItemProvider != null) contextRelationItemProvider.dispose();
		if (primitiveEventItemProvider != null) primitiveEventItemProvider.dispose();
		if (complexEventItemProvider != null) complexEventItemProvider.dispose();
		if (behaviouralDescriptionItemProvider != null) behaviouralDescriptionItemProvider.dispose();
		if (holdsAtItemProvider != null) holdsAtItemProvider.dispose();
		if (happensItemProvider != null) happensItemProvider.dispose();
		if (holdsAtBetweenItemProvider != null) holdsAtBetweenItemProvider.dispose();
		if (initiallyItemProvider != null) initiallyItemProvider.dispose();
		if (environmentItemProvider != null) environmentItemProvider.dispose();
		if (observerParamItemProvider != null) observerParamItemProvider.dispose();
		if (agentParamItemProvider != null) agentParamItemProvider.dispose();
		if (hypothesisItemProvider != null) hypothesisItemProvider.dispose();
		if (generalParamItemProvider != null) generalParamItemProvider.dispose();
		if (agentItemProvider != null) agentItemProvider.dispose();
		if (observerItemProvider != null) observerItemProvider.dispose();
		if (agentReferenceItemProvider != null) agentReferenceItemProvider.dispose();
		if (observerReferenceItemProvider != null) observerReferenceItemProvider.dispose();
		if (generalTypeReferenceItemProvider != null) generalTypeReferenceItemProvider.dispose();
		if (generalTypeItemProvider != null) generalTypeItemProvider.dispose();
	}

}
