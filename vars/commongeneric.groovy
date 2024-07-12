import org.python.CoveragePython
import org.python.Coverage2

def call1() {
    new CoveragePython().call()
    callCoverage2()
}

def callCoverage2() {
    new Coverage2().call()
}
