def seedjobRepository = 'https://github.com/MacJot/jenkins.git'

pipelineJob("job.from.seed.2") {
    description("Jenkins DEMO 2 Job")
    keepDependencies(false) 
    disabled(false)
    concurrentBuild(false)
    logRotator {
        numToKeep(500)
        daysToKeep(30)
    }
    definition {
        cpsScm {
            scm {
                git {
                    branch('*/master')
                    remote {
                        url(seedjobRepository)
                    }
                }
            }
        scriptPath('jobPipelines/job2.Jenkinsfile')
        }
    }
}
