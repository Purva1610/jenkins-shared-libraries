def call(String Projectname, String tag, String username){
  sh docker build -t "${username}/"${Projectname}":"${tag}" ."
  
}
