package initial.model.diagram.navigator;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import initial.model.diagram.edit.parts.EnvironmentEditPart;
import initial.model.diagram.edit.parts.InitiallyEditPart;
import initial.model.diagram.part.ModelDiagramEditorPlugin;
import initial.model.diagram.part.ModelVisualIDRegistry;
import initial.model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ModelNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ModelDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ModelDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ModelNavigatorItem && !isOwnView(((ModelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ModelNavigatorGroup) {
			ModelNavigatorGroup group = (ModelNavigatorGroup) element;
			return ModelDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ModelNavigatorItem) {
			ModelNavigatorItem navigatorItem = (ModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case EnvironmentEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?https://github.com/mlatona/minorityReportPlugin?Environment", //$NON-NLS-1$
					ModelElementTypes.Environment_1000);
		case InitiallyEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?Initially", //$NON-NLS-1$
					ModelElementTypes.Initially_2001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ModelDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ModelElementTypes.isKnownElementType(elementType)) {
			image = ModelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ModelNavigatorGroup) {
			ModelNavigatorGroup group = (ModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ModelNavigatorItem) {
			ModelNavigatorItem navigatorItem = (ModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_1000Text(view);
		case InitiallyEditPart.VISUAL_ID:
			return getInitially_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getEnvironment_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getInitially_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return EnvironmentEditPart.MODEL_ID.equals(ModelVisualIDRegistry.getModelID(view));
	}

}
