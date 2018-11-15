## Getting started

##git 
>git init 
>git add "filename"
>git commit -m "comment"
>git remote add "a github repository"
git remote add origin https://github.com/lswgithub/spring_boot_webpack.git
>git push -u origin master

Enter the command as follows.

 1. mvn install
 2. npm install
 3. java -jar dist/webpack-springboot-starter-1.0.0.jar (or Running in development tools)
 4. npm start
 
 개발할 때, npm run dev 또는 npm start
 배포할 때, npm run prod
 If you modify the js or scss file in the 'src/main/resources/static/*' directory, it will be automatically bundled.
 
 Development URL : http://localhost:8081/hello<br>
 Production URL : http://localhost:8080/hello
 
 
 ## npm update ##
npm install -g n npm stable
n stable 10.13.0
 
 
 ## react environment ##
npm install create-react-app
npm init react-app {app_folder_name}

development : npm start
production  : npm run build

 ## Official manual
 
 [Korean](https://medium.com/@alvin.h/%EC%9B%B9%ED%8C%A9-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EA%B8%B0%EB%B0%98%EC%9D%98-%ED%94%84%EB%A1%A0%ED%8A%B8%EC%97%94%EB%93%9C-%EA%B0%9C%EB%B0%9C-%ED%99%98%EA%B2%BD-%EA%B5%AC%EC%B6%95%ED%95%98%EA%B8%B0-87cd758e1eae)
