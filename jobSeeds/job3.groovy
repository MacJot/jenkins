pipelineJob("job.from.seed.3 ") {
    description("Jenkins DEMO 3 Job from ${SEED_JOB_REPO}")
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
                        url(SEED_JOB_REPO)
                    }
                }
            }
        scriptPath('jobPipelines/job3.Jenkinsfile')
        }
    }
}
