# tasks

BEFORE YOU INSTALL: please read the prerequisites

    
    npm remove -g @angular/cli
    npm cache clean --force

    npm install -g @angular/cli
    or
    npm install -g @angular/cli@latest
    or
    npm install -g @angular/cli@1.4

    ng --version
    npm install -save bootstrap

Generating and serving  Angular project via a development server

    cd src/main
    ng new frontend
    cd frontend
    npm install
    ng serve

    ng g c tasks
    ng g c /tasks/tasks-add
    ng g c /tasks/tasks-list
