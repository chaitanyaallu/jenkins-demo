pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('TestingCICD') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/chaitanyaallu/SpringbootWithJenkins.git'
                    }
                    branch 'TestingCICD'
                }
            }
        }
    }
}