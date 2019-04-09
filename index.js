
import { NativeModules } from 'react-native'

const { RNGpuInfo } = NativeModules

/**
 * Get the name of the GL renderer.
 */
export function getGlRenderer() {
    return RNGpuInfo.getGlRenderer()
}