package behavDesc.model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModelModelingAssistantProviderOfEnvironmentEditPart
		extends behavDesc.model.diagram.providers.ModelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(10);
		types.add(behavDesc.model.diagram.providers.ModelElementTypes.BehaviouralDescription_2001);
		types.add(behavDesc.model.diagram.providers.ModelElementTypes.Happens_2002);
		types.add(behavDesc.model.diagram.providers.ModelElementTypes.HoldsAt_2003);
		types.add(behavDesc.model.diagram.providers.ModelElementTypes.HoldsAtBetween_2004);
		types.add(behavDesc.model.diagram.providers.ModelElementTypes.AgentParam_2005);
		types.add(behavDesc.model.diagram.providers.ModelElementTypes.ObserverParam_2006);
		types.add(behavDesc.model.diagram.providers.ModelElementTypes.GeneralParam_2007);
		types.add(behavDesc.model.diagram.providers.ModelElementTypes.Agent_2008);
		types.add(behavDesc.model.diagram.providers.ModelElementTypes.GeneralType_2009);
		types.add(behavDesc.model.diagram.providers.ModelElementTypes.Observer_2010);
		return types;
	}

}
