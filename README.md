
# react-native-gpu-info

## Getting started

`$ npm install react-native-gpu-info --save`

### Mostly automatic installation

`$ react-native link react-native-gpu-info`

### Manual installation

#### Android

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
```javascript
import RNGpuInfo from 'react-native-gpu-info';
```
  