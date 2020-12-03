my @array;
while (my $msg = <STDIN>) {
chomp($msg);
push @array,$msg;
}
my $lines = join(",",@array);
print $lines,"\n";