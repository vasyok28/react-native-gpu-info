
1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNGpuInfoPackage;` to the imports at the top of the file
  - Add `new RNGpuInfoPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-gpu-info'
  	project(':react-native-gpu-info').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-gpu-info/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-gpu-info')
  	```


## Usage
Within your host activity add the following code;

```java
public class MainActivity extends ReactActivity { 
	private GlSurfaceInspector surfaceInspector = new GlSurfaceInspector();

	@Override
	public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			surfaceInspector.init(this);
	}
}
```

Then in your Javascript code import the library;

```javascript
import RNGpuInfo from 'react-native-gpu-info';
```

And retrieve the name of the GPU chip via;

```javascript
const glRenderer = RNGpuInfo.getGlRenderer()
```
