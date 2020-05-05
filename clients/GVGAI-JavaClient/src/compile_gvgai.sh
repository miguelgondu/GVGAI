rm -rf ./compiled_gvgai
mkdir -p compiled_gvgai
javac -d compiled_gvgai @sources.txt
cp -r server-out2/examples compiled_gvgai/
cp -r ../../../sprites compiled_gvgai/