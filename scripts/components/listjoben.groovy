import org.craftercms.blueprints.headless.JobEnSearchHelper


def searchHelper = new JobEnSearchHelper(elasticsearch, urlTransformationService)
def jobs = searchHelper.searchJobs(null,0,6)
templateModel.jobs = jobs