package typeinstance.model.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import model.ModelPackage;
import typeinstance.model.diagram.edit.parts.AgentEditPart;
import typeinstance.model.diagram.edit.parts.EnvironmentEditPart;
import typeinstance.model.diagram.edit.parts.GeneralTypeEditPart;
import typeinstance.model.diagram.edit.parts.InstanceEditPart;
import typeinstance.model.diagram.edit.parts.InstanceTypeEditPart;
import typeinstance.model.diagram.edit.parts.ObserverEditPart;
import typeinstance.model.diagram.part.ModelDiagramEditorPlugin;

/**
 * @generated
 */
public class ModelElementTypes {

	/**
	* @generated
	*/
	private ModelElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ModelDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Environment_1000 = getElementType(
			"org.eclipse.kEEPER.plugin.typeinstance.diagram.Environment_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Instance_2005 = getElementType(
			"org.eclipse.kEEPER.plugin.typeinstance.diagram.Instance_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GeneralType_2011 = getElementType(
			"org.eclipse.kEEPER.plugin.typeinstance.diagram.GeneralType_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Agent_2009 = getElementType(
			"org.eclipse.kEEPER.plugin.typeinstance.diagram.Agent_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Observer_2010 = getElementType(
			"org.eclipse.kEEPER.plugin.typeinstance.diagram.Observer_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InstanceType_4003 = getElementType(
			"org.eclipse.kEEPER.plugin.typeinstance.diagram.InstanceType_4003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Environment_1000, ModelPackage.eINSTANCE.getEnvironment());

			elements.put(Instance_2005, ModelPackage.eINSTANCE.getInstance());

			elements.put(GeneralType_2011, ModelPackage.eINSTANCE.getGeneralType());

			elements.put(Agent_2009, ModelPackage.eINSTANCE.getAgent());

			elements.put(Observer_2010, ModelPackage.eINSTANCE.getObserver());

			elements.put(InstanceType_4003, ModelPackage.eINSTANCE.getInstance_Type());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Environment_1000);
			KNOWN_ELEMENT_TYPES.add(Instance_2005);
			KNOWN_ELEMENT_TYPES.add(GeneralType_2011);
			KNOWN_ELEMENT_TYPES.add(Agent_2009);
			KNOWN_ELEMENT_TYPES.add(Observer_2010);
			KNOWN_ELEMENT_TYPES.add(InstanceType_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case EnvironmentEditPart.VISUAL_ID:
			return Environment_1000;
		case InstanceEditPart.VISUAL_ID:
			return Instance_2005;
		case GeneralTypeEditPart.VISUAL_ID:
			return GeneralType_2011;
		case AgentEditPart.VISUAL_ID:
			return Agent_2009;
		case ObserverEditPart.VISUAL_ID:
			return Observer_2010;
		case InstanceTypeEditPart.VISUAL_ID:
			return InstanceType_4003;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return typeinstance.model.diagram.providers.ModelElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return typeinstance.model.diagram.providers.ModelElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return typeinstance.model.diagram.providers.ModelElementTypes.getElement(elementTypeAdapter);
		}
	};

}
