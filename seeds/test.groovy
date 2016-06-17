pipelineJob('example-1a') {
  definition {
    cpsScm {
      scm {
        git('https://github.com/jenkinsci/job-dsl-plugin.git')
      }
      scriptPath('.jenkins/Jenkinsfile')
    }
    parameters {
        booleanParam('FLAG', true)
        choiceParam('OPTION', ['option 1 (default)', 'option 2', 'option 3'])
    }
    /*environmentVariables {
        env('ONE', '1')
        env('TWO', '2')
    }*/
    disabled()
    /* cps {
      script(readFileFromWorkspace('example-1.groovy'))
      sandbox()
    } */
  }
}
