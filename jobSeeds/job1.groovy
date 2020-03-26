def seedjobRepository = 'https://github.com/MacJot/jenkins.git'

pipelineJob("job.from.seed.1") {
    description("Jenkins DEMO 1 Job - fixed RAW")
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
        scriptPath('jobPipelines/job1.Jenkinsfile')
        }
    }
}
