def calt(String ProtectName, String ImageTag, String DockerHubUser){
  sh "docker build —t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
