echo "----- Test $1"
java -classpath .:./AST TestHL /home/abdullah/Dev/CPS710/Tests/A05/Tests/$1.hl >Tests/$1.expected
diff -b Tests/$1.expected /home/abdullah/Dev/CPS710/Tests/A05/Tests/$1.expected
