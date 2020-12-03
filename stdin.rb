lines = readlines
lines.each do |str|
  str.slice!("\n")
end
p lines