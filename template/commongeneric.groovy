// template/commongeneric.groovy

// Import functions from generic files
import org.generic.Checkout
import org.generic.Gitleaks
import org.generic.TrivyInstaller

// Define a method or class that utilizes the imported functions
def runAll(String url, String creds, String branch, String repoUrl) {
    Checkout.checkoutRepo(url, creds, branch)
    Gitleaks.runScan(repoUrl)
    TrivyInstaller.install()
}

return this // This is necessary if commongeneric.groovy is a script
