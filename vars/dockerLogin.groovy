#!/user/bin/env groovy

import com.example.Docker

def call() {
    def newInstance = new Docker(this)
    return newInstance.dockerLogin()
}
