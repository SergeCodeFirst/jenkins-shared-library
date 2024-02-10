#!/user/bin/env groovy

import com.example.Docker

def call(String imageName) {
    def newInstance = new Docker(this)
    return newInstance.buildImageAndPushToDocker(imageName)
}
