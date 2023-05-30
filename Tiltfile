# Build
custom_build(
     # Name of the container image
     ref = 'cns-config-service',
     # Command to build the container image
     command = 'gradlew bootBuildImage --imageName %EXPECTED_REF%',
     # Files to watch that trigger a new build
     deps = ['build.gradle.kts', 'src']
)

# Deploy
k8s_yaml(['k8s/deployment.yml', 'k8s/service.yml'])

# Manage
k8s_resource('cns-config-service', port_forwards=['8888'])
