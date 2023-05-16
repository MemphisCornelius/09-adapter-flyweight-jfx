package ohm.softa.a09.resource;

import javafx.scene.image.Image;
public class FxImageLoaderAdapter {

	private static ResourceLoader<Image> resourceLoader;

	public static Image loadImage(String resourcePath) {
		return loadImage(ClassLoader.getSystemClassLoader(), resourcePath);
	}

	public static Image loadImage(ClassLoader resourceContext, String resourcePath) {
		if (resourceLoader == null)
			resourceLoader = new ResourceLoader<>(Image::new);

		return resourceLoader.loadResource(resourceContext, resourcePath);
	}
}
