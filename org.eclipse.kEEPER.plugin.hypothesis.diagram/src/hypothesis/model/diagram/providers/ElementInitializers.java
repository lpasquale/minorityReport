package hypothesis.model.diagram.providers;

import hypothesis.model.diagram.part.ModelDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ModelDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ModelDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
